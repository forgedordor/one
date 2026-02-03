package androidx.camera.camera2;

import android.content.Context;
import defpackage.azq;
import defpackage.azr;
import defpackage.bio;
import defpackage.bip;
import defpackage.bli;
import defpackage.blo;
import defpackage.bnl;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider {
    public azr getCameraXConfig() {
        bip bipVar = new bip() { // from class: ala
            @Override // defpackage.bip
            public final biq a(Context context, bjf bjfVar, azg azgVar, long j, brh brhVar) {
                return new amc(context, bjfVar, azgVar, j, brhVar);
            }
        };
        bio bioVar = new bio() { // from class: alb
            @Override // defpackage.bio
            public final apm a(Context context, Object obj, Set set) throws bbq {
                try {
                    return new apm(context, new apl(), obj, set);
                } catch (azj e) {
                    throw new bbq(e);
                }
            }
        };
        bnl bnlVar = new bnl() { // from class: alc
            @Override // defpackage.bnl
            public final bnm a(Context context) {
                return new apr(context);
            }
        };
        bli bliVar = new azq().a;
        bliVar.c(azr.a, bipVar);
        bliVar.c(azr.b, bioVar);
        bliVar.c(azr.c, bnlVar);
        bliVar.c(azr.k, 0);
        return new azr(blo.f(bliVar));
    }
}
