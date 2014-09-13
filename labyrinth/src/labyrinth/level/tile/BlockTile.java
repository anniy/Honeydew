package labyrinth.level.tile;

import labyrinth.gfx.Render;
import labyrinth.gfx.Sprite;

public class BlockTile extends Tile {

    public BlockTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Render render) {
        render.renderTile(x << 5, y << 5, this);
    }

    public boolean solid() {
        return true;
    }
}
