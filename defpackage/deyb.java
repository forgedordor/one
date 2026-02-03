package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyb {
    public ewkt a;
    final /* synthetic */ deyc b;
    private final String c;
    private final int d;

    public deyb(deyc deycVar, String str, int i) {
        this.b = deycVar;
        this.c = str;
        this.d = i;
    }

    public final void a(ewkx ewkxVar) {
        this.b.g(this.d, this.c, 5, Optional.ofNullable(this.a), Optional.ofNullable(ewkxVar));
    }

    public final void b(String str, int i, long j) {
        Optional optionalOfNullable = Optional.ofNullable(this.a);
        ewlq ewlqVar = (ewlq) ewlr.a.createBuilder();
        ewlqVar.copyOnWrite();
        ewlr ewlrVar = (ewlr) ewlqVar.instance;
        ewlrVar.b |= 1;
        ewlrVar.c = i;
        ewlqVar.copyOnWrite();
        ewlr ewlrVar2 = (ewlr) ewlqVar.instance;
        ewlrVar2.b |= 2;
        ewlrVar2.d = (int) j;
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        ewlr ewlrVar3 = (ewlr) ewlqVar.build();
        ewlrVar3.getClass();
        ewlfVar.d = ewlrVar3;
        ewlfVar.c = 2;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlfVar2.e = 1;
        ewlfVar2.b |= 1;
        if (dfpe.n()) {
            ewldVar.copyOnWrite();
            ewlf ewlfVar3 = (ewlf) ewldVar.instance;
            str.getClass();
            ewlfVar3.b |= 4;
            ewlfVar3.g = str;
        }
        String str2 = this.c;
        int i2 = this.d;
        deyc deycVar = this.b;
        ewku ewkuVarF = deyc.f(i2, str2, optionalOfNullable);
        ewkuVarF.copyOnWrite();
        ewkz ewkzVar = (ewkz) ewkuVarF.instance;
        ewlf ewlfVar4 = (ewlf) ewldVar.build();
        ewkz ewkzVar2 = ewkz.a;
        ewlfVar4.getClass();
        ewkzVar.d = ewlfVar4;
        ewkzVar.b |= 2;
        deycVar.e(ewkuVarF);
    }

    public final void c(int i) {
        this.b.g(this.d, this.c, i, Optional.ofNullable(this.a), Optional.empty());
    }

    public final void d(String str, int i, Map map) {
        Optional optionalOfNullable = Optional.ofNullable(this.a);
        ewlg ewlgVar = (ewlg) ewlp.a.createBuilder();
        ewlgVar.copyOnWrite();
        ewlp ewlpVar = (ewlp) ewlgVar.instance;
        ewlpVar.c = i - 1;
        ewlpVar.b |= 1;
        ewlgVar.copyOnWrite();
        ((ewlp) ewlgVar.instance).a().putAll(map);
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        ewlp ewlpVar2 = (ewlp) ewlgVar.build();
        ewlpVar2.getClass();
        ewlfVar.d = ewlpVar2;
        ewlfVar.c = 1;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlfVar2.e = 1;
        ewlfVar2.b |= 1;
        if (dfpe.n()) {
            ewldVar.copyOnWrite();
            ewlf ewlfVar3 = (ewlf) ewldVar.instance;
            str.getClass();
            ewlfVar3.b |= 4;
            ewlfVar3.g = str;
        }
        String str2 = this.c;
        int i2 = this.d;
        deyc deycVar = this.b;
        ewku ewkuVarF = deyc.f(i2, str2, optionalOfNullable);
        ewkuVarF.copyOnWrite();
        ewkz ewkzVar = (ewkz) ewkuVarF.instance;
        ewlf ewlfVar4 = (ewlf) ewldVar.build();
        ewkz ewkzVar2 = ewkz.a;
        ewlfVar4.getClass();
        ewkzVar.d = ewlfVar4;
        ewkzVar.b |= 2;
        deycVar.e(ewkuVarF);
    }

    public final void e(String str) {
        Optional optionalOfNullable = Optional.ofNullable(this.a);
        ewla ewlaVar = (ewla) ewlc.a.createBuilder();
        ewlaVar.copyOnWrite();
        ewlc ewlcVar = (ewlc) ewlaVar.instance;
        ewlcVar.c = 2;
        ewlcVar.b |= 1;
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        ewlc ewlcVar2 = (ewlc) ewlaVar.build();
        ewlcVar2.getClass();
        ewlfVar.d = ewlcVar2;
        ewlfVar.c = 3;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlfVar2.e = 1;
        ewlfVar2.b |= 1;
        if (dfpe.n()) {
            ewldVar.copyOnWrite();
            ewlf ewlfVar3 = (ewlf) ewldVar.instance;
            str.getClass();
            ewlfVar3.b |= 4;
            ewlfVar3.g = str;
        }
        String str2 = this.c;
        int i = this.d;
        deyc deycVar = this.b;
        ewku ewkuVarF = deyc.f(i, str2, optionalOfNullable);
        ewkuVarF.copyOnWrite();
        ewkz ewkzVar = (ewkz) ewkuVarF.instance;
        ewlf ewlfVar4 = (ewlf) ewldVar.build();
        ewkz ewkzVar2 = ewkz.a;
        ewlfVar4.getClass();
        ewkzVar.d = ewlfVar4;
        ewkzVar.b |= 2;
        deycVar.e(ewkuVarF);
    }
}
