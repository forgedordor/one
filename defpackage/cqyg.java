package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqyg implements oef {
    final /* synthetic */ fdis a;
    final /* synthetic */ cqyh b;
    final /* synthetic */ long c;

    public cqyg(fdis fdisVar, cqyh cqyhVar, long j) {
        this.a = fdisVar;
        this.b = cqyhVar;
        this.c = j;
    }

    @Override // defpackage.oef
    public final void a(oay oayVar, ocs ocsVar) throws IOException {
        cqyh cqyhVar = this.b;
        eieu eieuVarA = eiiy.a("Transformer.onCompleted");
        fdis fdisVar = this.a;
        long j = this.c;
        try {
            Long lValueOf = Long.valueOf(ocsVar.b);
            fdisVar.e(lValueOf, cqye.a);
            ekrg ekrgVar = cqyh.a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleTranscoding");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 176, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", oayVar.d);
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleTranscoding");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 179, "TranscoderImpl.kt")).K("transformer succeeded in %s ms, durationMs: %s, width: %s, height: %s, bytes: %s.", Long.valueOf(cqyhVar.c.a() - j), Long.valueOf(ocsVar.a), Integer.valueOf(ocsVar.k), Integer.valueOf(ocsVar.j), lValueOf);
            cqxn cqxnVar = cqyhVar.d;
            cqxnVar.p(1);
            cqxnVar.k(cqyhVar.b(j));
            cqxnVar.b();
            fczl.a(eieuVarA, null);
        } finally {
        }
    }

    @Override // defpackage.oef
    public final void b(oay oayVar, ocp ocpVar) throws IOException {
        cqyh cqyhVar = this.b;
        eieu eieuVarA = eiiy.a("Transformer.onError");
        fdis fdisVar = this.a;
        long j = this.c;
        try {
            fdisVar.e(-1L, cqyf.a);
            ekrg ekrgVar = cqyh.a;
            ekrw ekrwVarI = ekrgVar.i();
            ekrz ekrzVar = eksq.a;
            ekrwVarI.X(ekrzVar, "BugleTranscoding");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", 208, "TranscoderImpl.kt")).C("transformer onError(%s) in %d ms.", ocpVar.getMessage(), cqyhVar.c.a() - j);
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleTranscoding");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", 213, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", oayVar.d);
            cqxn cqxnVar = cqyhVar.d;
            cqxnVar.p(2);
            cqxnVar.r(12);
            cqxnVar.k(cqyhVar.b(j));
            cqxnVar.b();
            fczl.a(eieuVarA, null);
        } finally {
        }
    }
}
