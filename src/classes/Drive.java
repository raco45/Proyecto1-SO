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
    private int scripts=0;
    private int levels=0;
    private int sprites=0;
    private int gameSystems=0;
    private int dlcs=0;
    private int games=0;
    private int gamesWithDlc=0;
    private String empresa;
    private int maxScripts;
    private int maxLevels;
    private int maxSprites;
    private int maxGameSystems;
    private int maxDlcs;
    private int contParaDlc;
    int cont=0;
    public Drive(int levels, int scripts, int sprites, int gameSystems, int dlcs, int games, String empresa) {
        this.maxScripts = scripts;
        this.maxLevels = levels;
        this.maxSprites = sprites;
        this.maxGameSystems = gameSystems;
        this.maxDlcs = dlcs;
        this.games = 0;
        this.empresa=empresa;
        
     
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

    
    public void addProduct(int productQty, int type, boolean esDlc){
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
                if(esDlc==true){
                    this.setGamesWithDlc(this.getGamesWithDlc()+productQty);
                    
                }else{
                    setGames(this.getGames() + productQty);
                    
                }
                break;
            default:
                break;
        }
    }
    public boolean returnDrive(int type){
        switch (type) {
            case 0:
                if (this.getScripts()>=25){
                    return true;
                }else {
                    return false;
                }
            case 1:
                if(this.getLevels()>=20){
                    return true;
                }else{
                    return false;
                }
            case 2:
                if(this.getSprites()>=20){
                    return true;
                }else{
                    return false;
                }
            case 3:
                if(this.getGameSystems()>=35){
                    return true;
                }else{
                    return false;
                }
            case 4:
                if(this.getDlcs()>=10){
                    return true;
                }else{
                    return false;
                }
            default:
                return false;
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

    /**
     * @return the gamesWithDlc
     */
    public int getGamesWithDlc() {
        return gamesWithDlc;
    }

    /**
     * @param gamesWithDlc the gamesWithDlc to set
     */
    public void setGamesWithDlc(int gamesWithDlc) {
        this.gamesWithDlc = gamesWithDlc;
    }
}
