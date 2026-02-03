package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azvl {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter");
    public final String a;
    public final fcsu b;
    public final azvn c;
    public final fcsu d;
    public final ahzu e;

    public azvl(String str, fcsu fcsuVar, azvn azvnVar, ahzv ahzvVar, fcsu fcsuVar2) {
        this.a = str;
        this.b = fcsuVar;
        this.c = azvnVar;
        this.d = fcsuVar2;
        this.e = ahzvVar.a(f, null, null);
    }

    public final void a(String str, long j) {
        ekrw ekrwVarG = f.g();
        ekrwVarG.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "logDuration-HG0u8IE", 124, "BatchedRestoreTableWriter.kt")).I("[%s] [%s] duration [%s]ms", this.a, str, Long.valueOf(fdhi.g(j)));
    }

    public final void b() {
        ((dqsn) this.b.b()).d("BatchedRestoreTableWriter.preRestore", new Runnable() { // from class: azvk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.b(null);
            }
        });
    }

    public final void c(final int i) {
        azvn azvnVar = this.c;
        int iA = azvnVar.a();
        int i2 = (iA / i) + (iA % i > 0 ? 1 : 0);
        if (i2 <= 0) {
            return;
        }
        final int i3 = 1;
        while (true) {
            ahzu ahzuVar = this.e;
            String str = this.a;
            Integer numValueOf = Integer.valueOf(i3);
            ahzuVar.j("[%s] Processing batch [%s]/[%s]", str, numValueOf, Integer.valueOf(i2));
            a(a.e(i3, "batch ", " txn time"), ayrq.c("BatchedRestoreTableWriter::restoreTable#txnTime", new fdae() { // from class: azvj
                @Override // defpackage.fdae
                public final Object invoke() {
                    final azvl azvlVar = this.a;
                    dqsn dqsnVar = (dqsn) azvlVar.b.b();
                    final int i4 = i3;
                    final int i5 = i;
                    dqsnVar.d("BatchedRestoreTableWriter.restoreTable", new Runnable() { // from class: azvi
                        @Override // java.lang.Runnable
                        public final void run() throws IOException {
                            final azvl azvlVar2 = azvlVar;
                            final int i6 = i4;
                            final int i7 = i5;
                            azvlVar2.a(a.e(i6, "batch ", " inner time"), ayrq.c("BatchedRestoreTableWriter::restoreTable#innerTime", new fdae() { // from class: azvh
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    int i8 = fdhq.a;
                                    azvl azvlVar3 = azvlVar2;
                                    azvn azvnVar2 = azvlVar3.c;
                                    long jB = fdhq.b();
                                    azvnVar2.g(i7, null);
                                    azvlVar3.a("updateNextBatchStatusToPreparing", fdhr.b(jB));
                                    ahzu ahzuVar2 = azvlVar3.e;
                                    String str2 = azvlVar3.a;
                                    ahzuVar2.h("[%s] Checking for duplicates", str2);
                                    fcsu fcsuVar = azvlVar3.d;
                                    long jB2 = fdhq.b();
                                    boolean zA = ((arji) fcsuVar.b()).a();
                                    Boolean.valueOf(zA).getClass();
                                    azvnVar2.c(true != zA ? null : ahzuVar2);
                                    azvlVar3.a("findAndMarkDuplicates", fdhr.b(jB2));
                                    ahzuVar2.h("[%s] Inserting to Bugle", str2);
                                    long jB3 = fdhq.b();
                                    boolean zA2 = ((arji) fcsuVar.b()).a();
                                    Boolean.valueOf(zA2).getClass();
                                    azvnVar2.d(true == zA2 ? ahzuVar2 : null);
                                    azvlVar3.a("performBugleInsert", fdhr.b(jB3));
                                    ahzuVar2.i("[%s] Finalizing batch [%s]", str2, Integer.valueOf(i6));
                                    long jB4 = fdhq.b();
                                    azvnVar2.f();
                                    azvlVar3.a("updateBatchStatusToWritten", fdhr.b(jB4));
                                    return fctx.a;
                                }
                            }));
                        }
                    });
                    return fctx.a;
                }
            }));
            ahzuVar.i("[%s] Executing post batch work [%s]", str, numValueOf);
            int i4 = fdhq.a;
            fcsu fcsuVar = this.d;
            long jB = fdhq.b();
            boolean zA = ((arji) fcsuVar.b()).a();
            Boolean.valueOf(zA).getClass();
            if (true != zA) {
                ahzuVar = null;
            }
            azvnVar.e(ahzuVar);
            a("postBatchWork", fdhr.b(jB));
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }
}
