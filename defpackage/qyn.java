package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyn implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qyo qyoVar = (qyo) obj;
        qyo qyoVar2 = (qyo) obj2;
        return ekdr.b.b(qyoVar.getPref(), qyoVar2.getPref()).b(qyoVar.getAppearanceOrder(), qyoVar2.getAppearanceOrder()).a();
    }
}
