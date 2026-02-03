package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrl implements Cloneable {
    int f;
    public fgrt a = fgrt.base;
    private Charset h = fgqy.a;
    public final ThreadLocal b = new ThreadLocal();
    public final boolean c = true;
    public final int d = 1;
    public final int e = 30;
    public final int g = 1;

    final CharsetEncoder a() {
        CharsetEncoder charsetEncoderNewEncoder = this.h.newEncoder();
        this.b.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.f = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        return charsetEncoderNewEncoder;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fgrl clone() {
        try {
            fgrl fgrlVar = (fgrl) super.clone();
            fgrlVar.h = Charset.forName(this.h.name());
            fgrlVar.a = (fgrt) Enum.valueOf(fgrt.class, this.a.name());
            return fgrlVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
