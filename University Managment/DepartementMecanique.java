import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */
public class DepartementMecanique extends Departement {
    public static final String CLASS_NAME = DepartementMecanique.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material

    @Override
    public void placer(Material material) {
        super.placer(material);
    }

    @Override
    public void setMaterial(List<Material> material) {
        super.setMaterial(material);
    }
}
