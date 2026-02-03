package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asvj {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    public final asvi b;
    public final ahey c;

    public asvj(asvi asviVar, ahey aheyVar) {
        this.b = asviVar;
        this.c = aheyVar;
    }

    public static asva a(Iterable iterable) {
        asuz asuzVar = (asuz) asva.a.createBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            asvb asvbVar = (asvb) asvc.a.createBuilder();
            String[] strArrSplit = str.split("=", -1);
            if (dhim.d(strArrSplit[0])) {
                ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertToRcsCapabilities", 111, "RcsCapabilitiesConverter.java")).t("Unable to convert empty or malformed capability {%s}", str);
            } else {
                String str2 = strArrSplit[0];
                asvbVar.copyOnWrite();
                asvc asvcVar = (asvc) asvbVar.instance;
                str2.getClass();
                asvcVar.b |= 1;
                asvcVar.c = str2;
                String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
                asvbVar.copyOnWrite();
                asvc asvcVar2 = (asvc) asvbVar.instance;
                str3.getClass();
                asvcVar2.b |= 2;
                asvcVar2.d = str3;
                asuzVar.a((asvc) asvbVar.build());
            }
        }
        return (asva) asuzVar.build();
    }
}
