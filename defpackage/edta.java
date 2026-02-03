package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edta implements ecpw {
    final /* synthetic */ edtb a;

    public edta(edtb edtbVar) {
        this.a = edtbVar;
    }

    @Override // defpackage.ecpw
    public final void a(String str, int i) {
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        eurn eurnVar = (eurn) euro.a.createBuilder();
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        euroVar.c = 21;
        euroVar.b |= 1;
        eurb eurbVar = (eurb) eurc.a.createBuilder();
        eurbVar.copyOnWrite();
        eurc eurcVar = (eurc) eurbVar.instance;
        eurcVar.b |= 8;
        eurcVar.f = ecpv.a(i);
        eurc eurcVar2 = (eurc) eurbVar.build();
        eurnVar.copyOnWrite();
        euro euroVar2 = (euro) eurnVar.instance;
        eurcVar2.getClass();
        euroVar2.e = eurcVar2;
        euroVar2.b |= 4;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar3 = (euro) eurnVar.build();
        euroVar3.getClass();
        eurkVar.d = euroVar3;
        eurkVar.b |= 1;
        this.a.b.c((eurk) eurjVar.build());
    }

    @Override // defpackage.ecpw
    public final void b(ecqt ecqtVar) {
        String str;
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        eurn eurnVar = (eurn) euro.a.createBuilder();
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        euroVar.c = 21;
        euroVar.b |= 1;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar2 = (euro) eurnVar.build();
        euroVar2.getClass();
        eurkVar.d = euroVar2;
        eurkVar.b |= 1;
        eurk eurkVar2 = (eurk) eurjVar.build();
        edtb edtbVar = this.a;
        edtbVar.b.c(eurkVar2);
        boolean z = edtbVar.g;
        ekgi ekgiVar = new ekgi();
        edmz edmzVar = edtbVar.e;
        int i = edmzVar.c;
        String str2 = "null";
        switch (i) {
            case 1:
                str = "UNKNOWN_ENTRY_POINT";
                break;
            case 2:
                str = "CONTACTS_ROW_CLICKED";
                break;
            case 3:
                str = "CONTACTS_ROW_EDIT_ICON";
                break;
            case 4:
                str = "CONTACTS_SEARCH_BAR";
                break;
            case 5:
                str = "CONTACTS_CREATE_CONTACT_BUTTON";
                break;
            case 6:
                str = "CONTACTS_TRASH_ROW_CLICKED";
                break;
            case 7:
                str = "OBAKE_CAMERA_PHOTO_SELECTED";
                break;
            case 8:
                str = "OBAKE_DEVICE_PHOTO_SELECTED";
                break;
            case 9:
                str = "OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED";
                break;
            case 10:
                str = "EMAIL_BUTTON";
                break;
            case 11:
                str = "SCHEDULE_BUTTON";
                break;
            case 12:
                str = "CHAT_BUTTON";
                break;
            case 13:
                str = "CALL_BUTTON";
                break;
            case 14:
                str = "MEET_BUTTON";
                break;
            case 15:
                str = "OBAKE_ART_PHOTO_SELECTED";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        ekgiVar.i("uientrypoint", str);
        exwb exwbVarB = exwb.b(edtbVar.f.c);
        if (exwbVarB == null) {
            exwbVarB = exwb.UNKNOWN_APPLICATION;
        }
        ekgiVar.i("hostapp", exwbVarB.name());
        if (fbgs.c() && fbgs.d() && edmzVar.c == 15) {
            int i2 = edmzVar.b;
            if (i2 == 1) {
                str2 = "UNKNOWN";
            } else if (i2 == 2) {
                str2 = "PRESET";
            } else if (i2 == 3) {
                str2 = "CUSTOMIZED";
            }
            if (i2 == 0) {
                throw null;
            }
            ekgiVar.i("selectedColorCustomizationType", str2);
        }
        ekgiVar.i("wasMonogram", Boolean.toString(edtbVar.g));
        edtbVar.d.j(new edsw(ecqtVar, z, ekgiVar.c()));
    }
}
