/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author luisa
 */
public class Drive {
    private int scripts;
    private int levels;
    private int sprites;
    private int gameSystems;
    private int dlcs;
    private int games;
    private int gamesWithDlc;

    public Drive(int levels, int scripts, int sprites, int gameSystems, int dlcs, int games) {
        this.scripts = scripts;
        this.levels = levels;
        this.sprites = sprites;
        this.gameSystems = gameSystems;
        this.dlcs = dlcs;
        this.games = games;
    }

//    Drive(int i, int i0, int i1, int i2, int i3) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    
    public void addProduct(int productQty, int type){
        switch (type) {
            case 0:
                setScripts(this.getScripts() + productQty);
                break;
            case 1:
                setLevels(this.getLevels() + productQty);
                break;
            case 2:
                setSprites(this.getSprites() + productQty);
                break;
            case 3:
                setGameSystems(this.getGameSystems() + productQty);
                break;
            case 4:
                setDlcs(this.getDlcs() + productQty);
                break;
            case 5:
                // if games>=4...  comparo hacer en una funcion aparte
                setGames(this.getGames() + productQty);
                break;
            default:
                break;
        }
    }
    public void printDrives(int type){
        switch (type) {
            case 0:
                System.out.println("scripts "+ this.getScripts());
                break;
            case 1:
                System.out.println("Levels "+ this.getLevels());
                break;
            case 2:
                System.out.println("Sprites "+this.getSprites());
                break;
            case 3:
                System.out.println("Game systems "+ this.getGameSystems());
                break;
            case 4:
                System.out.println("dlc "+this.getDlcs());
                break;
            default:
                break;
        }
    }
    
    /**
     * @return the scripts
     */
    public int getScripts() {
        return scripts;
    }

    /**
     * @param scripts the scripts to set
     */
    public void setScripts(int scripts) {
        this.scripts = scripts;
    }

    /**
     * @return the sprites
     */
    public int getSprites() {
        return sprites;
    }

    /**
     * @param sprites the sprites to set
     */
    public void setSprites(int sprites) {
        this.sprites = sprites;
    }

    /**
     * @return the gameSystems
     */
    public int getGameSystems() {
        return gameSystems;
    }

    /**
     * @param gameSystems the gameSystems to set
     */
    public void setGameSystems(int gameSystems) {
        this.gameSystems = gameSystems;
    }

    /**
     * @return the dlcs
     */
    public int getDlcs() {
        return dlcs;
    }

    /**
     * @param dlcs the dlcs to set
     */
    public void setDlcs(int dlcs) {
        this.dlcs = dlcs;
    }

    /**
     * @return the games
     */
    public int getGames() {
        return games;
    }

    /**
     * @param games the games to set
     */
    public void setGames(int games) {
        this.games = games;
    }
}
