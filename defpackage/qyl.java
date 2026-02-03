package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyl {
    public static final Pattern a = Pattern.compile("(data[:])?(.*?)[;](base64)[,](.*)");
    public final String b;
    public final byte[] c;

    public qyl(String str, byte[] bArr) {
        this.b = str;
        this.c = bArr;
    }
}
