package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public class miq {
    public int a;

    public final boolean d() {
        return eR(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    public void eP() {
        this.a = 0;
    }

    public final void eQ(int i) {
        this.a = i | this.a;
    }

    public final boolean eR(int i) {
        return (this.a & i) == i;
    }

    public final boolean eS() {
        return eR(4);
    }

    public final boolean f() {
        return eR(1);
    }

    public final boolean g() {
        return eR(536870912);
    }
}
