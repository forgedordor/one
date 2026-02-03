package defpackage;

import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ednj implements rti {
    final /* synthetic */ EditActivity a;

    public ednj(EditActivity editActivity) {
        this.a = editActivity;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        ednl ednlVar = this.a.t;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        int i = edgn.a;
        eurf eurfVar = (eurf) eurg.a.createBuilder();
        int iB = edgn.b(obj);
        eurfVar.copyOnWrite();
        eurg eurgVar = (eurg) eurfVar.instance;
        eurgVar.c = iB - 1;
        eurgVar.b |= 1;
        eurg eurgVar2 = (eurg) eurfVar.build();
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurgVar2.getClass();
        eureVar.d = eurgVar2;
        eureVar.c = 9;
        eurc eurcVarA = edgn.a(rhsVar);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eurcVarA.getClass();
        eureVar2.f = eurcVarA;
        eureVar2.b |= 2;
        ednlVar.b(eurdVar);
        return false;
    }

    @Override // defpackage.rti
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        ednl ednlVar = this.a.t;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        int i = edgn.a;
        eurf eurfVar = (eurf) eurg.a.createBuilder();
        int iB = edgn.b(obj2);
        eurfVar.copyOnWrite();
        eurg eurgVar = (eurg) eurfVar.instance;
        eurgVar.c = iB - 1;
        eurgVar.b |= 1;
        int iOrdinal = rebVar.ordinal();
        int i2 = 3;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 5;
            } else if (iOrdinal == 2) {
                i2 = 2;
            } else if (iOrdinal != 3) {
                i2 = 4;
                if (iOrdinal != 4) {
                    throw new RuntimeException(null, null);
                }
            } else {
                i2 = 6;
            }
        }
        eurfVar.copyOnWrite();
        eurg eurgVar2 = (eurg) eurfVar.instance;
        eurgVar2.d = i2 - 1;
        eurgVar2.b |= 2;
        eurg eurgVar3 = (eurg) eurfVar.build();
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurgVar3.getClass();
        eureVar.d = eurgVar3;
        eureVar.c = 9;
        ednlVar.b(eurdVar);
        return false;
    }
}
