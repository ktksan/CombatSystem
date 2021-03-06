package org.terasology.combatSystem.weaponFeatures.components;

import org.terasology.entitySystem.Component;
import org.terasology.math.geom.Vector3f;
import org.terasology.network.Replicate;

/**
 * the entity would traverse like an arrow.
 * <p>
 * The entity would always be facing tangent to its path.
 */
public class ArrowComponent implements Component{
    @Replicate
    public Vector3f previousDir = new Vector3f();

}
