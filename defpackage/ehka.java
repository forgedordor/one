package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehka implements eyif {
    public static ehey a(ehkg ehkgVar, ehez ehezVar, final efwo efwoVar, Map map, final egip egipVar, final eheg ehegVar, Executor executor, final egbf egbfVar, final ehhy ehhyVar) {
        ehkgVar.getClass();
        ehezVar.getClass();
        efwoVar.getClass();
        ehegVar.getClass();
        executor.getClass();
        egbfVar.getClass();
        return ehezVar.a(ehde.d, new fdap() { // from class: ehjv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                Uri uriA = egipVar.a(egip.a, "phenotype/".concat(str)).a();
                uriA.getClass();
                return uriA;
            }
        }, executor, map, ehjy.a, new ehjz(ehkgVar), new eooz() { // from class: ehjw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return ehegVar.b(str, efwoVar);
            }
        }, new fdae() { // from class: ehjx
            @Override // defpackage.fdae
            public final Object invoke() {
                return ehhyVar.a(((egdb) egbfVar.i(efwoVar)).a);
            }
        });
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
