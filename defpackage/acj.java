package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acj {
    public static /* synthetic */ ack a(int i, int i2) {
        return new ack(i, i2, new fdap() { // from class: aci
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        });
    }
}
