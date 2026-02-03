package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekew extends ekfc {
    final /* synthetic */ ekfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekew(ekfd ekfdVar) {
        super(ekfdVar);
        this.a = ekfdVar;
    }

    @Override // defpackage.ekfc
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ekeu(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            ekfd ekfdVar = this.a;
            int iB = ekfdVar.b(key);
            if (iB != -1 && ejwh.a(value, ekfdVar.b[iB])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iB = ekfh.b(key);
        ekfd ekfdVar = this.a;
        int iC = ekfdVar.c(key, iB);
        if (iC == -1 || !ejwh.a(value, ekfdVar.b[iC])) {
            return false;
        }
        ekfdVar.g(iC, iB);
        return true;
    }
}
