package defpackage;

import j$.net.URLDecoder;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomr extends eken implements Cloneable, Serializable {
    public static final eomr a = new eomr(ekdy.a);
    private static final long serialVersionUID = -3053773769157973706L;
    public final ekjo b;

    public eomr(ekjo ekjoVar) {
        this.b = new eomd(ekjoVar);
    }

    public static String f(String str, int i, int i2, Charset charset, boolean z) {
        try {
            return z ? new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(StandardCharsets.ISO_8859_1), charset) : URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.eken
    protected final ekjo b() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new eomr(new ekjn(this.b));
    }

    @Override // defpackage.eken, defpackage.ekeq
    protected final /* synthetic */ ekmj e() {
        return this.b;
    }

    @Override // defpackage.ekeq, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.b;
    }

    @Override // defpackage.eker
    public final String toString() throws IOException {
        Charset charset = eomq.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = u().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) eomq.a((String) entry.getKey(), charset));
                if (!((String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(eomq.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public eomr() {
        this(new ekjn(12));
    }
}
