package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkx implements eyif {
    public static ehey a(ehez ehezVar, eosc eoscVar, final efwo efwoVar, ehkg ehkgVar, final egip egipVar, final eheg ehegVar, Map map, final egbf egbfVar, final ehhy ehhyVar) {
        ehezVar.getClass();
        eoscVar.getClass();
        efwoVar.getClass();
        ehkgVar.getClass();
        ehegVar.getClass();
        egbfVar.getClass();
        return ehezVar.a(ehde.b, new fdap() { // from class: ehkr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                Uri uriA = egipVar.a(egip.a, "phenotype/".concat(str)).a();
                uriA.getClass();
                return uriA;
            }
        }, eoscVar, map, ehku.a, new ehkv(ehkgVar), new eooz() { // from class: ehks
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return ehegVar.b(str, efwoVar);
            }
        }, new fdae() { // from class: ehkt
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
