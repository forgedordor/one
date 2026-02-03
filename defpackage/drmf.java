package defpackage;

import android.os.Trace;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drmf implements drkn {
    @Override // defpackage.drkn
    public final /* synthetic */ Object a(InputStream inputStream) {
        return drmh.a(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drkn
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        ekrg ekrgVar = drmh.a;
        plm.a("BundledEmojiListLoader.saveToCacheFile");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            try {
                ekqh it = ((ekgb) obj).iterator();
                while (it.hasNext()) {
                    drna drnaVar = (drna) it.next();
                    bufferedWriter.write(drnaVar.a);
                    ekqh it2 = drnaVar.b.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str != null) {
                            bufferedWriter.write(44);
                            bufferedWriter.write(str);
                        }
                    }
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }
}
