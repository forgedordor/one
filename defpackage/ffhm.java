package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhm {
    private static final ByteArrayBuffer a = i(ffho.f, ": ");
    private static final ByteArrayBuffer b = i(ffho.f, VCardBuilder.VCARD_END_OF_LINE);
    private static final ByteArrayBuffer c = i(ffho.f, "--");
    private final String d;
    private final Charset e;
    private final String f;
    private final List<ffhk> g;
    private final ffhn h;

    /* compiled from: PG */
    /* renamed from: ffhm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ffhn.values().length];
            a = iArr;
            try {
                iArr[ffhn.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ffhn.BROWSER_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ffhm(String str, String str2) {
        this(str, null, str2);
    }

    private static ByteArrayBuffer i(Charset charset, String str) {
        ByteBuffer byteBufferEncode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(byteBufferEncode.remaining());
        byteArrayBuffer.append(byteBufferEncode.array(), byteBufferEncode.position(), byteBufferEncode.remaining());
        return byteArrayBuffer;
    }

    private void j(ffhn ffhnVar, OutputStream outputStream, boolean z) throws IOException {
        ByteArrayBuffer byteArrayBufferI = i(this.e, b());
        for (ffhk ffhkVar : this.g) {
            l(c, outputStream);
            l(byteArrayBufferI, outputStream);
            l(b, outputStream);
            ffhl ffhlVarB = ffhkVar.b();
            int i = AnonymousClass1.a[ffhnVar.ordinal()];
            if (i == 1) {
                Iterator<ffhp> it = ffhlVarB.iterator();
                while (it.hasNext()) {
                    n(it.next(), outputStream);
                }
            } else if (i == 2) {
                o(ffhkVar.b().d(ffho.c), this.e, outputStream);
                if (ffhkVar.c().f() != null) {
                    o(ffhkVar.b().d(ffho.a), this.e, outputStream);
                }
            }
            ByteArrayBuffer byteArrayBuffer = b;
            l(byteArrayBuffer, outputStream);
            if (z) {
                ffhkVar.c().h(outputStream);
            }
            l(byteArrayBuffer, outputStream);
        }
        ByteArrayBuffer byteArrayBuffer2 = c;
        l(byteArrayBuffer2, outputStream);
        l(byteArrayBufferI, outputStream);
        l(byteArrayBuffer2, outputStream);
        l(b, outputStream);
    }

    private static void k(String str, OutputStream outputStream) throws IOException {
        l(i(ffho.f, str), outputStream);
    }

    private static void l(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) throws IOException {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void m(String str, Charset charset, OutputStream outputStream) throws IOException {
        l(i(charset, str), outputStream);
    }

    private static void n(ffhp ffhpVar, OutputStream outputStream) throws IOException {
        k(ffhpVar.b(), outputStream);
        l(a, outputStream);
        k(ffhpVar.a(), outputStream);
        l(b, outputStream);
    }

    private static void o(ffhp ffhpVar, Charset charset, OutputStream outputStream) throws IOException {
        m(ffhpVar.b(), charset, outputStream);
        l(a, outputStream);
        m(ffhpVar.a(), charset, outputStream);
        l(b, outputStream);
    }

    public long a() {
        Iterator<ffhk> it = this.g.iterator();
        long j = 0;
        while (it.hasNext()) {
            long jA = it.next().c().a();
            if (jA < 0) {
                return -1L;
            }
            j += jA;
        }
        try {
            j(this.h, new ByteArrayOutputStream(), false);
            return j + r0.toByteArray().length;
        } catch (IOException unused) {
            return -1L;
        }
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public Charset d() {
        return this.e;
    }

    public List<ffhk> e() {
        return this.g;
    }

    public ffhn f() {
        return this.h;
    }

    public void g(ffhk ffhkVar) {
        if (ffhkVar == null) {
            return;
        }
        this.g.add(ffhkVar);
    }

    public void h(OutputStream outputStream) throws IOException {
        j(this.h, outputStream, true);
    }

    public ffhm(String str, Charset charset, String str2) {
        this(str, charset, str2, ffhn.STRICT);
    }

    public ffhm(String str, Charset charset, String str2, ffhn ffhnVar) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        }
        if (str2 != null) {
            this.d = str;
            this.e = charset == null ? ffho.f : charset;
            this.f = str2;
            this.g = new ArrayList();
            this.h = ffhnVar;
            return;
        }
        throw new IllegalArgumentException("Multipart boundary may not be null");
    }
}
