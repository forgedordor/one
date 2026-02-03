package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfo implements esfr, esft {
    public final esgu a;
    public final esgu b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public esfo(final Context context, final String str, Set set, esgu esguVar, Executor executor) {
        this.a = new esgu() { // from class: esfk
            @Override // defpackage.esgu
            public final Object a() {
                return new esfu(context, str);
            }
        };
        this.d = set;
        this.e = executor;
        this.b = esguVar;
        this.c = context;
    }

    @Override // defpackage.esfr
    public final defn a() {
        return !lal.a(this.c) ? degc.c("") : degc.a(this.e, new Callable() { // from class: esfl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                esfo esfoVar = this.a;
                synchronized (esfoVar) {
                    Object objA = esfoVar.a.a();
                    List listA = ((esfu) objA).a();
                    ((esfu) objA).b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < listA.size(); i++) {
                        esfv esfvVar = (esfv) listA.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", esfvVar.a());
                        jSONObject.put("dates", new JSONArray((Collection) esfvVar.b()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.esft
    public final synchronized int b() {
        esgu esguVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = esguVar.a();
        if (!((esfu) objA).g(jCurrentTimeMillis)) {
            return 1;
        }
        ((esfu) objA).c();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            degc.c(null);
        } else if (lal.a(this.c)) {
            degc.a(this.e, new Callable() { // from class: esfn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    esfo esfoVar = this.a;
                    synchronized (esfoVar) {
                        ((esfu) esfoVar.a.a()).d(System.currentTimeMillis(), ((esli) esfoVar.b.a()).a());
                    }
                    return null;
                }
            });
        } else {
            degc.c(null);
        }
    }
}
