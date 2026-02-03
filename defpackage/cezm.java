package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezm {
    public static final cezm a = new cezm();
    private static final Map b = new LinkedHashMap();

    private cezm() {
    }

    public final synchronized cezj a(Context context) {
        return b(new dcpn(context));
    }

    public final synchronized cezj b(final dcpn dcpnVar) {
        Object objComputeIfAbsent;
        Map map = b;
        final fdap fdapVar = new fdap() { // from class: cezk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                cezm cezmVar = cezm.a;
                str.getClass();
                return new cezj(str, dcpnVar);
            }
        };
        objComputeIfAbsent = Map.EL.computeIfAbsent(map, "tachyon_send_message", new Function() { // from class: cezl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cezm cezmVar = cezm.a;
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objComputeIfAbsent.getClass();
        return (cezj) objComputeIfAbsent;
    }
}
