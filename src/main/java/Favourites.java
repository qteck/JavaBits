class Favourites {
    String[] musicTrack = new String[5];

    public static void main(String[] args) {

        Favourites favourites = new Favourites();

        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }

    public boolean allFilled(String[] bool) {
        boolean bla = true;

        for (String b : bool) {
            if (b == null) {
                bla = false;
            }
        }

        return bla;
    }

    public void addTrack(String artist, String title) {

        if (!allFilled(musicTrack)) {
            for (int i = 0; i < musicTrack.length; i++) {
                if (musicTrack[i] == null) {
                    musicTrack[i] = title + " | " + artist;
                    break;
                }
            }
        } else System.out.println("Sorry, can't add: " + title + " | " + artist + "\n");

    }

    public void showFavourites() {
        for (String track : musicTrack) {
            if (track != null) {
                System.out.println(track);
            }

        }
    }

}