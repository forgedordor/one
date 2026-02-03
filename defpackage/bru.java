package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bru {
    public static boolean a(bly blyVar) {
        Iterator it = blyVar.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).i()) {
                return true;
            }
        }
        return false;
    }
}
