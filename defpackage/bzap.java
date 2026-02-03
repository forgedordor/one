package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Queue;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzap {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper");
    public static final int b = ((bzas.a(3) | bzas.a(5)) | bzas.a(65)) | bzas.a(33);
    public final efwo c;
    public final bykf d;
    private final Queue e;
    private final Queue f;
    private final Queue g;
    private final ains h;
    private final fdjx i;
    private final bzdx j;
    private final cpmc k;
    private final cpqk l;

    public bzap(Queue queue, Queue queue2, Queue queue3, ains ainsVar, fdjx fdjxVar, efwo efwoVar, bykf bykfVar, bzdx bzdxVar, cpmc cpmcVar, cpqk cpqkVar) {
        queue.getClass();
        queue2.getClass();
        queue3.getClass();
        ainsVar.getClass();
        fdjxVar.getClass();
        efwoVar.getClass();
        bykfVar.getClass();
        cpmcVar.getClass();
        cpqkVar.getClass();
        this.e = queue;
        this.f = queue2;
        this.g = queue3;
        this.h = ainsVar;
        this.i = fdjxVar;
        this.c = efwoVar;
        this.d = bykfVar;
        this.j = bzdxVar;
        this.k = cpmcVar;
        this.l = cpqkVar;
    }

    public static final ekhx i(Queue queue) {
        ekhv ekhvVarI = ekhx.i(0);
        while (true) {
            String str = (String) queue.poll();
            if (str == null) {
                break;
            }
            ekhvVarI.c(str);
        }
        ekhx ekhxVarG = ekhvVarI.g();
        if (true != ekhxVarG.isEmpty()) {
            return ekhxVarG;
        }
        return null;
    }

    private final eiju j(Queue queue, int i, int i2, fdap fdapVar) {
        return auvw.c(this.i, fcyi.a, fdjz.a, new bzam(this, queue, i, i2, fdapVar, null));
    }

    public final eiju a() {
        return j(this.e, 3, 2, new fdap() { // from class: bzaj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                final String str = (String) obj;
                str.getClass();
                botb botbVarE = botm.e();
                botbVarE.A("Cms#getConversationTableIdFromCmsId");
                botbVarE.c(botm.c.a);
                botbVarE.i(new Function() { // from class: bzai
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        botl botlVar = (botl) obj2;
                        botlVar.e(str);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                dqqj dqqjVarP = botbVarE.b().p();
                try {
                    bopr boprVar = (bopr) dqqjVarP;
                    if (!boprVar.moveToFirst()) {
                        throw new RuntimeException(a.x(str, " not found in BugleDb"));
                    }
                    String strA = boprVar.h().a();
                    fczl.a(dqqjVarP, null);
                    strA.getClass();
                    return strA;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(dqqjVarP, th);
                        throw th2;
                    }
                }
            }
        });
    }

    public final eiju b() {
        return auvw.c(this.i, fcyi.a, fdjz.a, new bzao(this, null));
    }

    public final eiju c() {
        return j(this.g, 4, 3, new fdap() { // from class: bzal
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                final String str = (String) obj;
                str.getClass();
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("Cms#getParticipantTableIdFromCmsId");
                bsboVarE.c(ParticipantsTable.c.a);
                bsboVarE.h(new Function() { // from class: bzak
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar = (bsbx) obj2;
                        bsbxVar.d(str);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                dqqj dqqjVarP = bsboVarE.b().p();
                try {
                    brzj brzjVar = (brzj) dqqjVarP;
                    if (!brzjVar.moveToFirst()) {
                        throw new RuntimeException(a.x(str, " not found in BugleDb"));
                    }
                    String strO = brzjVar.o();
                    fczl.a(dqqjVarP, null);
                    strO.getClass();
                    return strO;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(dqqjVarP, th);
                        throw th2;
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0134 -> B:25:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014c -> B:25:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzap.d(fcxy):java.lang.Object");
    }

    public final void e(String str) {
        str.getClass();
        this.e.add(str);
    }

    public final void f(String str) {
        str.getClass();
        this.f.add(str);
    }

    public final void g(String str) {
        this.g.add(str);
    }

    public final void h(int i, int i2) {
        this.h.f("Bugle.Cms.Cloudstore.ZeroKeyFallback", i, i2);
    }
}
