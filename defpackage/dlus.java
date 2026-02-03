package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import j$.util.Optional;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlus {
    private static final ekrg a = ekrg.c("com/google/android/libraries/compose/attachments/resolver/AttachmentResolver");
    private final dlvl b;
    private final eony c;
    private final eygg d;
    private final eygg e;
    private final fcsu f;
    private final fctc g;

    public dlus(dlvl dlvlVar, eony eonyVar, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, final fcsu fcsuVar2) {
        dlvlVar.getClass();
        eonyVar.getClass();
        eyggVar.getClass();
        eyggVar2.getClass();
        fcsuVar2.getClass();
        this.b = dlvlVar;
        this.c = eonyVar;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = fcsuVar;
        this.g = fctd.a(new fdae() { // from class: dlun
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objB = fcsuVar2.b();
                objB.getClass();
                Optional optional = (Optional) objB;
                return (dluu) (optional.isPresent() ? optional.get() : new dluu(null));
            }
        });
    }

    private final dluu d() {
        return (dluu) this.g.a();
    }

    private final dluz e(doig doigVar) {
        doif doifVar = doigVar.b;
        if (fdbq.f(doifVar, doia.a) && !d().c) {
            return null;
        }
        dluz dluzVar = (dluz) ((Map) this.d.b()).get(doigVar);
        return dluzVar == null ? (dluz) ((Map) this.e.b()).get(doifVar) : dluzVar;
    }

    private static final doig f(Uri uri, String str, fdae fdaeVar) {
        doig doigVarA;
        if (str != null && (doigVarA = dohx.a(str)) != null) {
            return doigVarA;
        }
        doig doigVar = (doig) fdaeVar.invoke();
        if (doigVar != null) {
            return doigVar;
        }
        String string = uri.toString();
        string.getClass();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(string);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension != null) {
            return dohx.a(mimeTypeFromExtension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlvd r15, android.net.Uri r16, defpackage.dltc r17, boolean r18, defpackage.fdae r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlus.a(dlvd, android.net.Uri, dltc, boolean, fdae, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r3 != r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r18, defpackage.dltc r19, defpackage.fdae r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlus.b(android.net.Uri, dltc, fdae, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r11, defpackage.dltc r12, boolean r13, defpackage.fdae r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlus.c(android.net.Uri, dltc, boolean, fdae, fcxy):java.lang.Object");
    }
}
