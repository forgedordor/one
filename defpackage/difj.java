package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class difj {
    public static ewzw a(int i, int i2) {
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        ewzz ewzzVar = (ewzz) exaa.a.createBuilder();
        ewzzVar.copyOnWrite();
        exaa exaaVar = (exaa) ewzzVar.instance;
        exaaVar.b |= 1;
        exaaVar.c = i;
        ewzzVar.copyOnWrite();
        exaa exaaVar2 = (exaa) ewzzVar.instance;
        exaaVar2.d = i2 - 2;
        exaaVar2.b |= 2;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exaa exaaVar3 = (exaa) ewzzVar.build();
        exaaVar3.getClass();
        ewzwVar.c = exaaVar3;
        ewzwVar.b = 1;
        return (ewzw) ewzvVar.build();
    }

    public static ewzw b(UUID uuid, int i, UUID uuid2) {
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        exaf exafVar = (exaf) exag.a.createBuilder();
        String string = uuid.toString();
        exafVar.copyOnWrite();
        exag exagVar = (exag) exafVar.instance;
        string.getClass();
        exagVar.b |= 1;
        exagVar.e = string;
        String string2 = uuid2.toString();
        exafVar.copyOnWrite();
        exag exagVar2 = (exag) exafVar.instance;
        string2.getClass();
        exagVar2.b |= 2;
        exagVar2.f = string2;
        exah exahVar = (exah) exai.a.createBuilder();
        exahVar.copyOnWrite();
        exai exaiVar = (exai) exahVar.instance;
        exaiVar.c = ettt.a(4);
        exaiVar.b |= 1;
        exahVar.copyOnWrite();
        exai exaiVar2 = (exai) exahVar.instance;
        exaiVar2.d = i - 2;
        exaiVar2.b |= 2;
        exafVar.copyOnWrite();
        exag exagVar3 = (exag) exafVar.instance;
        exai exaiVar3 = (exai) exahVar.build();
        exaiVar3.getClass();
        exagVar3.d = exaiVar3;
        exagVar3.c = 3;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exag exagVar4 = (exag) exafVar.build();
        exagVar4.getClass();
        ewzwVar.c = exagVar4;
        ewzwVar.b = 3;
        return (ewzw) ewzvVar.build();
    }

    public static ewzw c(UUID uuid, int i, UUID uuid2) {
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        exaf exafVar = (exaf) exag.a.createBuilder();
        String string = uuid.toString();
        exafVar.copyOnWrite();
        exag exagVar = (exag) exafVar.instance;
        string.getClass();
        exagVar.b |= 1;
        exagVar.e = string;
        String string2 = uuid2.toString();
        exafVar.copyOnWrite();
        exag exagVar2 = (exag) exafVar.instance;
        string2.getClass();
        exagVar2.b |= 2;
        exagVar2.f = string2;
        exah exahVar = (exah) exai.a.createBuilder();
        exahVar.copyOnWrite();
        exai exaiVar = (exai) exahVar.instance;
        exaiVar.c = ettt.a(i);
        exaiVar.b |= 1;
        exafVar.copyOnWrite();
        exag exagVar3 = (exag) exafVar.instance;
        exai exaiVar2 = (exai) exahVar.build();
        exaiVar2.getClass();
        exagVar3.d = exaiVar2;
        exagVar3.c = 3;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exag exagVar4 = (exag) exafVar.build();
        exagVar4.getClass();
        ewzwVar.c = exagVar4;
        ewzwVar.b = 3;
        return (ewzw) ewzvVar.build();
    }
}
