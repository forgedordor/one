package defpackage;

import android.os.Trace;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drmg implements drkn {
    @Override // defpackage.drkn
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream) throws IOException {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return ekfwVar.g();
                }
                ekfwVar.h(line);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drkn
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        ekrg ekrgVar = drmh.a;
        plm.a("BundledEmojiListLoader.saveToBinaryStringCacheFile");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            try {
                ekqh it = ((ekgb) obj).iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
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
