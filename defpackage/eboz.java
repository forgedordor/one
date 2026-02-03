package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eboz extends ebpc {
    public static final byte[] a = VCardBuilder.VCARD_END_OF_LINE.getBytes();

    public eboz() {
        super(4);
    }

    @Override // defpackage.ebpc
    public final String a() {
        return VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.ebpc
    public final byte[] b() {
        return a;
    }
}
