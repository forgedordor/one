package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqyh implements cqxx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl");
    public final egpm b;
    public final cogw c;
    public final cqxn d;
    private final fdjx e;
    private final cqxw f;
    private final cqmz g;
    private final fcsu h;
    private final cqyj i;

    public cqyh(Context context, egpm egpmVar, fdjx fdjxVar, cqxw cqxwVar, cogw cogwVar, cqmz cqmzVar, cqui cquiVar, cqxn cqxnVar, cqyj cqyjVar, fcsu fcsuVar) {
        context.getClass();
        egpmVar.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        cqmzVar.getClass();
        cquiVar.getClass();
        cqxnVar.getClass();
        fcsuVar.getClass();
        this.b = egpmVar;
        this.e = fdjxVar;
        this.f = cqxwVar;
        this.c = cogwVar;
        this.g = cqmzVar;
        this.d = cqxnVar;
        this.i = cqyjVar;
        this.h = fcsuVar;
    }

    @Override // defpackage.cqxx
    public final eiju a(cqwt cqwtVar) throws IOException {
        eieu eieuVarA = eiiy.a("Transformer.transcode");
        try {
            fdjx fdjxVar = this.e;
            fcyi fcyiVar = fcyi.a;
            eiju eijuVarG = eiju.g(fdxs.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new cqxy(null, this, cqwtVar)));
            eieuVarA.b(eijuVarG);
            fczl.a(eieuVarA, null);
            eijuVarG.getClass();
            return eijuVarG;
        } finally {
        }
    }

    public final Duration b(long j) {
        return Duration.between(Instant.ofEpochMilli(j), Instant.ofEpochMilli(this.c.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cqwt r43, defpackage.fcxy r44) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqyh.c(cqwt, fcxy):java.lang.Object");
    }
}
