package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feuc extends feou {
    public static final feuc c = new feub("AUDIO");
    public static final feuc d = new feub("DISPLAY");
    public static final feuc e = new feub(VCardConstants.PROPERTY_EMAIL);
    public static final feuc f = new feub("PROCEDURE");
    private static final long serialVersionUID = -2353353838411753712L;
    private String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuc() {
        super("ACTION");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.g;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuc(feor feorVar, String str) {
        super("ACTION", feorVar);
        fera feraVar = fera.a;
        this.g = str;
    }
}
