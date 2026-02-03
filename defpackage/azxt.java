package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxt implements azvb {
    public static final azxt a = new azxt();

    private azxt() {
    }

    public static final azcd d() {
        String[] strArr = azcg.a;
        azcd azcdVar = new azcd(azcg.a);
        azbr azbrVar = azcg.c;
        azcdVar.c(azbrVar.a, azbrVar.b);
        return azcdVar;
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azcg.c.a;
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws b() {
        return d();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azcd azcdVar = (azcd) dqwsVar;
        azbs[] azbsVarArr = (azbs[]) list.toArray(new azbs[0]);
        azcdVar.c((azbs[]) Arrays.copyOf(azbsVarArr, azbsVarArr.length));
        return azcdVar;
    }
}
