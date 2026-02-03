package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwc {
    public final Map a;
    private final Map b;

    public dlwc(Map map, Map map2) {
        this.b = map;
        this.a = map2;
    }

    public final dlul a(dltd dltdVar) throws dlwa {
        dlwg dlwgVar = (dlwg) this.b.get(dltdVar.getClass());
        if (dlwgVar == null) {
            Objects.toString(dltdVar);
            throw new dlwa("No AttachmentSerializer found for ".concat(dltdVar.toString()));
        }
        evuh evuhVarD = dlwgVar.b.d(dltdVar);
        dluk dlukVar = (dluk) dlul.a.createBuilder();
        dlukVar.getClass();
        dlukVar.copyOnWrite();
        dlul dlulVar = (dlul) dlukVar.instance;
        dlulVar.b |= 1;
        dlulVar.c = dlwgVar.a;
        dlukVar.copyOnWrite();
        dlul dlulVar2 = (dlul) dlukVar.instance;
        dlulVar2.b |= 2;
        dlulVar2.d = 1;
        evqs byteString = evuhVarD.toByteString();
        byteString.getClass();
        dlukVar.copyOnWrite();
        dlul dlulVar3 = (dlul) dlukVar.instance;
        dlulVar3.b |= 4;
        dlulVar3.e = byteString;
        evsn evsnVarBuild = dlukVar.build();
        evsnVarBuild.getClass();
        return (dlul) evsnVarBuild;
    }
}
