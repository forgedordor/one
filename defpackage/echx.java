package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echx implements echu {
    private static boolean c = false;
    private final Context e;
    private final ecgd f;
    private volatile boolean g = false;
    private eqsz h = null;
    public static final byte[] a = new byte[0];
    private static final Object d = new Object();
    public static final ecgd b = ecgd.a();

    public echx(Context context, ecgd ecgdVar) {
        this.e = context;
        this.f = ecgdVar;
    }

    private static byte[] h(String str) {
        return Base64.decode(str, 2);
    }

    @Override // defpackage.echu
    public final InputStream a(Uri uri, final InputStream inputStream) throws GeneralSecurityException, IOException {
        ecfv ecfvVarB = ecfx.b(uri);
        g();
        try {
            if (ecfvVarB.a().isEmpty()) {
                return this.h.a(inputStream, a);
            }
            ecfw ecfwVar = (ecfw) ecfvVarB.a().get(0);
            String str = ecfwVar.a;
            if (Objects.equals(str, "aes_gcm_key")) {
                final byte[] bArrH = h(ecfwVar.b);
                return new ecgo(new Callable() { // from class: echw
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IOException {
                        byte[] bArr = echx.a;
                        byte[] bArr2 = bArrH;
                        InputStream inputStream2 = inputStream;
                        try {
                            return new erum(bArr2).a(elec.b(inputStream2), echx.a);
                        } finally {
                            inputStream2.close();
                        }
                    }
                });
            }
            if (!Objects.equals(str, "aes_gcm_hkdf_key")) {
                throw new ecgh(a.v(ecfwVar.a, "Unsupported decryption mode: "));
            }
            try {
                return ((eqsz) eqsb.a(eqsa.a(h(ecfwVar.b))).h(ertl.a(), eqsz.class)).a(inputStream, a);
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to decrypt stream", e);
        }
    }

    @Override // defpackage.echu
    public final OutputStream b(Uri uri, OutputStream outputStream) throws IOException {
        ecfv ecfvVarB = ecfx.b(uri);
        g();
        try {
            if (ecfvVarB.a().isEmpty()) {
                return this.h.b(outputStream, a);
            }
            throw new ecgh(a.v(((ecfw) ecfvVarB.a().get(0)).a, "Unsupported encryption mode: "));
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt stream", e);
        }
    }

    @Override // defpackage.echu
    public final String c() {
        return "encrypt";
    }

    @Override // defpackage.echu
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return echt.a(this, outputStream);
    }

    public final void g() {
        if (this.g) {
            return;
        }
        synchronized (d) {
            if (!this.g) {
                try {
                    Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    Context context = this.e;
                    ecfk.b(ecez.b(context), builderPath);
                    builderPath.appendPath("mobstore_encrypt");
                    Closeable closeable = (Closeable) new ecev(Arrays.asList(new ecfn(this.f))).c(ecfk.a(builderPath, ekfwVar), new echa(false, false));
                    try {
                        if (!c) {
                            erti.a();
                            c = true;
                        }
                        erde erdeVar = new erde();
                        erdeVar.c(context.getApplicationContext(), "aes128_gcm_hkdf_4kb", "mobstore_encrypt");
                        erfp erfpVar = ersu.a;
                        erdeVar.d = (eqsj) ergg.a(new ergf() { // from class: erst
                            @Override // defpackage.ergf
                            public final Object a() {
                                erfp erfpVar2 = ersu.a;
                                ersv ersvVar = new ersv();
                                ersvVar.d(16);
                                ersvVar.c(16);
                                ersvVar.b(4096);
                                ersvVar.a = ersw.b;
                                return new eqsj(ersvVar.a());
                            }
                        });
                        erdeVar.b("android-keystore://mobstore_encrypt");
                        this.h = (eqsz) erdeVar.a().a().h(ertl.a(), eqsz.class);
                        if (closeable != null) {
                            closeable.close();
                        }
                        this.g = true;
                    } catch (Throwable th) {
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (GeneralSecurityException e) {
                    throw new IOException("Failed to initialize encryption", e);
                }
            }
        }
    }

    @Override // defpackage.echu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.echu
    public final /* synthetic */ void f() {
    }
}
