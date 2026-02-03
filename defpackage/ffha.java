package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum ffha {
    CR("\r"),
    CRLF(VCardBuilder.VCARD_END_OF_LINE),
    LF("\n");

    public final String d;

    ffha(String str) {
        this.d = str;
    }
}
