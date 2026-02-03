package defpackage;

import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class akod extends fdbo implements fdap {
    public static final akod a = new akod();

    public akod() {
        super(1, Arrays.class, "stream", "stream([Ljava/lang/Object;)Ljava/util/stream/Stream;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        return DesugarArrays.stream(strArr);
    }
}
