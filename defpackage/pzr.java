package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzr extends fdbr implements fdap {
    public static final pzr a = new pzr();

    public pzr() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            value.getClass();
        }
        sb.append(value);
        return sb.toString();
    }
}
