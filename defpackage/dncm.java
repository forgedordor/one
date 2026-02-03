package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dncm extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ dnco c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dncm(fdap fdapVar, dnco dncoVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdapVar;
        this.c = dncoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long jLongValue;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdap fdapVar = this.b;
            this.a = 1;
            obj = fdapVar.invoke(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            final InputStream inputStream = (InputStream) closeable;
            try {
                jLongValue = ((Number) this.c.c.d("InputStreamSizeCalculator.sizeBytes", new fdae() { // from class: dncl
                    @Override // defpackage.fdae
                    public final Object invoke() throws IOException {
                        long jSkip;
                        ekrg ekrgVar = dnco.a;
                        ekrd ekrdVar = (ekrd) ekrgVar.g().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 38, "InputStreamSizeCalculator.kt");
                        InputStream inputStream2 = inputStream;
                        ekrdVar.B("%s.available(): %d", inputStream2.getClass(), inputStream2.available());
                        int i2 = 0;
                        long j = 0;
                        do {
                            jSkip = inputStream2.skip(inputStream2.available());
                            j += jSkip;
                            i2++;
                        } while (jSkip > 0);
                        if (inputStream2.available() > 0) {
                            ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 50, "InputStreamSizeCalculator.kt")).t("%s skipped 0 bytes but still has bytes available", inputStream2.getClass());
                        } else if (inputStream2.read() != -1) {
                            ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 54, "InputStreamSizeCalculator.kt")).t("%s reported 0 available but read() has not reached end of stream", inputStream2.getClass());
                        }
                        ((ekrd) ekrgVar.g().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 57, "InputStreamSizeCalculator.kt")).r("InputStream.sizeBytes() skipCount: %d", i2);
                        return Long.valueOf(j);
                    }
                })).longValue();
            } catch (IOException e) {
                ((ekrd) ((ekrd) dnco.a.i()).g(e).h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$getSizeBytes$2$1", "invokeSuspend", 29, "InputStreamSizeCalculator.kt")).t("sizeBytes failed on %s, returning 0", inputStream.getClass());
                jLongValue = 0;
            }
            Long l = new Long(jLongValue);
            fczl.a(closeable, null);
            return l;
        } finally {
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dncm(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
