package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhye implements fdap {
    public final dhzq a;
    private final dhzt b;

    public dhye(dhzq dhzqVar, dhzt dhztVar) {
        this.a = dhzqVar;
        this.b = dhztVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Data data = (Data) obj;
        data.getClass();
        int i = dhzr.a;
        Data data2 = new Data();
        ByteBuffer byteBuffer = this.a.a;
        dhzt dhztVar = this.b;
        TartarusKt.runScarBlobs(byteBuffer, 1, dhztVar.a, dhztVar.b, dhztVar.c, dhztVar.d, data, data2);
        return data2;
    }
}
