package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caej {
    /* JADX WARN: Multi-variable type inference failed */
    public static caei a(int i, ekgb ekgbVar, caee caeeVar) {
        ejwl.b(!ekgbVar.isEmpty(), "No step is specified for B&R opt-out flow.");
        caec caecVar = (caec) caei.b.createBuilder();
        caecVar.copyOnWrite();
        caei caeiVar = (caei) caecVar.instance;
        caeiVar.c |= 1;
        caeiVar.d = i;
        caecVar.copyOnWrite();
        caei caeiVar2 = (caei) caecVar.instance;
        caeiVar2.h = caeeVar.e;
        caeiVar2.c |= 8;
        caecVar.copyOnWrite();
        caei caeiVar3 = (caei) caecVar.instance;
        caeiVar3.f = 1;
        caeiVar3.c |= 4;
        caeg caegVar = (caeg) ekgbVar.get(0);
        caecVar.copyOnWrite();
        caei caeiVar4 = (caei) caecVar.instance;
        caeiVar4.e = caegVar.m;
        caeiVar4.c |= 2;
        caecVar.a(ekgbVar);
        return (caei) caecVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static caei b(int i, ekgb ekgbVar) {
        ejwl.b(!ekgbVar.isEmpty(), "No step is specified for Multi-Device opt-out flow.");
        caec caecVar = (caec) caei.b.createBuilder();
        caecVar.copyOnWrite();
        caei caeiVar = (caei) caecVar.instance;
        caeiVar.c |= 1;
        caeiVar.d = i;
        caee caeeVar = caee.MD_OPT_OUT;
        caecVar.copyOnWrite();
        caei caeiVar2 = (caei) caecVar.instance;
        caeiVar2.h = caeeVar.e;
        caeiVar2.c |= 8;
        caecVar.copyOnWrite();
        caei caeiVar3 = (caei) caecVar.instance;
        caeiVar3.f = 1;
        caeiVar3.c |= 4;
        caeg caegVar = (caeg) ekgbVar.get(0);
        caecVar.copyOnWrite();
        caei caeiVar4 = (caei) caecVar.instance;
        caeiVar4.e = caegVar.m;
        caeiVar4.c |= 2;
        caecVar.a(ekgbVar);
        return (caei) caecVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Optional c(caei caeiVar) {
        caeg caegVarB = caeg.b(caeiVar.e);
        if (caegVarB == null) {
            caegVarB = caeg.UNSPECIFIED_STEP;
        }
        evsz evszVar = new evsz(caeiVar.g, caei.a);
        if (!evszVar.contains(caegVarB)) {
            throw new cpze(36, cpyz.NO_RETRY);
        }
        int size = evszVar.size() - 1;
        int iIndexOf = evszVar.indexOf(caegVarB);
        if (size == iIndexOf) {
            return Optional.empty();
        }
        caec caecVar = (caec) caeiVar.toBuilder();
        caeg caegVar = (caeg) evszVar.get(iIndexOf + 1);
        caecVar.copyOnWrite();
        caei caeiVar2 = (caei) caecVar.instance;
        caeiVar2.e = caegVar.m;
        caeiVar2.c |= 2;
        caecVar.copyOnWrite();
        caei caeiVar3 = (caei) caecVar.instance;
        caeiVar3.f = 1;
        caeiVar3.c |= 4;
        return Optional.of((caei) caecVar.build());
    }

    public static String d(caei caeiVar) {
        String str;
        int i = caeiVar.d;
        caeg caegVarB = caeg.b(caeiVar.e);
        if (caegVarB == null) {
            caegVarB = caeg.UNSPECIFIED_STEP;
        }
        switch (caegVarB.ordinal()) {
            case 1:
                str = "Tachyon_Unregister";
                break;
            case 2:
                str = "Set_Server_Status_Off";
                break;
            case 3:
                str = "Complete_Opt_Out_Md";
                break;
            case 4:
                str = "Clear_Primary_Device_Id";
                break;
            case 5:
                str = "Clear_Initial_Sync_Status";
                break;
            case 6:
                str = "Reset_Box";
                break;
            case 7:
                str = "Cancel_Work_Manager_Work";
                break;
            case 8:
                str = "Complete_Opt_Out_Bnr";
                break;
            case 9:
                str = "Complete_Downgrade_MultiDevice_to_Backup_and_Restore";
                break;
            case 10:
                str = "Clear_feature_types";
                break;
            case 11:
                str = "Retrieve_Cms_Timestamp";
                break;
            default:
                str = "Unspecified_Step";
                break;
        }
        return i + str;
    }
}
