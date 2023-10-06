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

    public Drive(int levels, int scripts, int sprites, int gameSystems, int dlcs) {
        this.levels = levels;
        this.scripts = scripts;
        this.sprites = sprites;
        this.gameSystems = gameSystems;
        this.dlcs = dlcs;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getNarrative() {
        return getScripts();
    }

    public void setNarrative(int narrative) {
        this.setScripts(narrative);
    }
    
    public void addProduct(int productQty, int type){
    if(type == 0){
        setLevels(getLevels()+productQty);
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
}
