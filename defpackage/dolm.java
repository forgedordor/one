package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolm implements dluz {
    public static final Duration a;
    public static final Size b;
    private static final ekrg d;
    public final domi c;
    private final eony e;
    private final fcsu f;
    private final fctc g;

    static {
        Duration duration = Duration.ZERO;
        duration.getClass();
        a = duration;
        b = new Size(0, 0);
        d = ekrg.c("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver");
    }

    public dolm(domi domiVar, eony eonyVar, fcsu fcsuVar, final fcsu fcsuVar2) {
        domiVar.getClass();
        eonyVar.getClass();
        fcsuVar2.getClass();
        this.c = domiVar;
        this.e = eonyVar;
        this.f = fcsuVar;
        this.g = fctd.a(new fdae() { // from class: dole
            @Override // defpackage.fdae
            public final Object invoke() {
                Duration duration = dolm.a;
                Object objB = fcsuVar2.b();
                objB.getClass();
                Optional optional = (Optional) objB;
                return (dluu) (optional.isPresent() ? optional.get() : new dluu(null));
            }
        });
    }

    public static /* synthetic */ Object d(dolm dolmVar, dlvd dlvdVar, Uri uri, doig doigVar, dltc dltcVar, boolean z, fcxy fcxyVar) {
        doig doigVarA;
        if (doigVar == null) {
            String strE = dlvdVar.e();
            doigVarA = strE != null ? dohx.a(strE) : null;
        } else {
            doigVarA = doigVar;
        }
        if (doigVarA != null) {
            dogj dogjVarA = dogi.a(doigVarA, dolmVar.f().d);
            if (dogjVarA == null) {
                ((ekrd) d.i().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "fromCursor$suspendImpl", 70, "LocalMediaResolver.kt")).D("Cannot resolve format from %s (parameter) and %s (cursor), falling back to image", doigVar, dlvdVar.e());
                dogjVarA = dohm.b;
            }
            return dolmVar.c(dogjVarA, uri, dlvdVar.d(), dlvdVar.c(), dltcVar, new dolg(dolmVar, dlvdVar, uri, z, null), new dolh(dolmVar, dlvdVar, uri, z, null), new doli(dolmVar, dlvdVar, uri, z, null), fcxyVar);
        }
        throw new IllegalArgumentException("Media type was unspecified and not found in Cursor metadata (" + dlvdVar.e() + ")");
    }

    public static /* synthetic */ Object e(dolm dolmVar, dogj dogjVar, Uri uri, Long l, Instant instant, dltc dltcVar, fcxy fcxyVar) {
        return dolmVar.c(dogjVar, uri, l, instant, dltcVar, new dolj(dolmVar, uri, null), new dolk(dolmVar, uri, null), new doll(dolmVar, uri, null), fcxyVar);
    }

    private final dluu f() {
        return (dluu) this.g.a();
    }

    private final Object g(Uri uri, fcxy fcxyVar) {
        ((ekrd) d.j().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "getSizeBytesWhenMissing", 290, "LocalMediaResolver.kt")).t("Missing size bytes, falling back to input stream %b", Boolean.valueOf(f().b));
        return f().b ? ((dncg) this.f.b()).a(uri, fcxyVar) : new Long(0L);
    }

    @Override // defpackage.dluz
    public final Object a(dlvd dlvdVar, Uri uri, doig doigVar, dltc dltcVar, boolean z, fcxy fcxyVar) {
        return d(this, dlvdVar, uri, doigVar, dltcVar, z, fcxyVar);
    }

    @Override // defpackage.dluz
    public final Object b(dogj dogjVar, Uri uri, dltc dltcVar, fcxy fcxyVar) {
        return e(this, dogjVar, uri, null, null, dltcVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dogj r26, android.net.Uri r27, java.lang.Long r28, j$.time.Instant r29, defpackage.dltc r30, defpackage.fdap r31, defpackage.fdap r32, defpackage.fdap r33, defpackage.fcxy r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dolm.c(dogj, android.net.Uri, java.lang.Long, j$.time.Instant, dltc, fdap, fdap, fdap, fcxy):java.lang.Object");
    }
}
