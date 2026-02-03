package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum ekly implements ejvr {
    KEY,
    VALUE;

    @Override // defpackage.ejvr
    public final /* synthetic */ Object apply(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return ((Map.Entry) obj).getKey();
        }
        if (iOrdinal == 1) {
            return ((Map.Entry) obj).getValue();
        }
        throw null;
    }
}
