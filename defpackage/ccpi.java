package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpi implements cbtk {
    private final Context a;
    private final cqms b;
    private final ccpj c;

    public ccpi(Context context, cqms cqmsVar, apwn apwnVar, ccpj ccpjVar) {
        context.getClass();
        apwnVar.getClass();
        this.a = context;
        this.b = cqmsVar;
        this.c = ccpjVar;
    }

    @Override // defpackage.cbtk
    public final cbti a(byte[] bArr, String str) {
        int length = bArr.length;
        ccpk ccpkVarA = this.c.a("");
        evqs evqsVarX = evqs.b;
        if (length > 0) {
            evqsVarX = evqs.x(ccpkVarA.b(bArr));
        }
        epsp epspVarA = ccpkVarA.a();
        evqs evqsVarU = evqsVarX.u(epspVarA.c);
        evqsVarU.getClass();
        epwb epwbVar = (epwb) epwc.a.createBuilder();
        epwbVar.getClass();
        epwd.b(str, epwbVar);
        epvy epvyVar = epspVarA.b;
        if (epvyVar == null) {
            epvyVar = epvy.a;
        }
        epvyVar.getClass();
        epwd.c(epvyVar, epwbVar);
        return new cbti(evqsVarU, new cbtd(epwd.a(epwbVar)));
    }

    @Override // defpackage.cbtk
    public final cbtj b(Uri uri, String str, String str2) throws IOException, ErrnoException {
        final ccpk ccpkVarA = this.c.a(str);
        final fdci fdciVar = new fdci();
        InputStream inputStreamA = this.b.a(uri);
        try {
            fdev fdevVarJ = fdey.j(fdey.d(new fdae() { // from class: ccox
                @Override // defpackage.fdae
                public final Object invoke() throws IOException {
                    byte[] bArr = new byte[102400];
                    int i = inputStreamA.read(bArr, 0, 102400);
                    if (i == -1) {
                        return null;
                    }
                    return i < 102400 ? fcur.s(bArr, i) : bArr;
                }
            }), new fdap() { // from class: ccpg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    bArr.getClass();
                    return ccpkVarA.b(bArr);
                }
            });
            final fdae fdaeVar = new fdae() { // from class: ccph
                @Override // defpackage.fdae
                public final Object invoke() {
                    epsp epspVarA = ccpkVarA.a();
                    epvy epvyVar = epspVarA.b;
                    if (epvyVar == null) {
                        epvyVar = epvy.a;
                    }
                    fdciVar.a = epvyVar;
                    return epspVarA.c.I();
                }
            };
            final fdft fdftVar = new fdft((fdfu) fdevVarJ);
            final fdce fdceVar = new fdce();
            Uri uriG = bxlf.g(ccpa.a(fdey.d(new fdae() { // from class: ccov
                @Override // defpackage.fdae
                public final Object invoke() {
                    Iterator it = fdftVar;
                    if (it.hasNext()) {
                        return it.next();
                    }
                    fdce fdceVar2 = fdceVar;
                    if (fdceVar2.a) {
                        return null;
                    }
                    fdae fdaeVar2 = fdaeVar;
                    fdceVar2.a = true;
                    return fdaeVar2.invoke();
                }
            })), this.a);
            fczl.a(inputStreamA, null);
            if (fdciVar.a == null) {
                throw new IllegalStateException("Encryption information isn't present, did we lose access to the scratch space?");
            }
            uriG.getClass();
            epwb epwbVar = (epwb) epwc.a.createBuilder();
            epwbVar.getClass();
            epwbVar.copyOnWrite();
            epwc epwcVar = (epwc) epwbVar.instance;
            epwcVar.b |= 1;
            epwcVar.c = str;
            epwd.b(str2, epwbVar);
            Object obj = fdciVar.a;
            obj.getClass();
            epwd.c((epvy) obj, epwbVar);
            return new cbtj(uriG, new cbtd(epwd.a(epwbVar)));
        } finally {
        }
    }
}
