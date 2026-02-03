package defpackage;

import java.util.Collection;
import org.json.JSONArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class avpq {
    /* JADX WARN: Multi-variable type inference failed */
    static avpq b(ekgb ekgbVar) {
        ekno eknoVar = ekno.a;
        ekpj.a(eknoVar, ekgbVar);
        Object[] objArrR = ekis.r(ekgbVar);
        ekik ekikVarX = ekik.x(eknoVar, objArrR.length, objArrR);
        return ekikVarX.size() == 1 ? new avof((String) ((ekoo) ekikVarX).d.get(0)) : new avof(new JSONArray((Collection) ekikVarX).toString());
    }

    public abstract String a();
}
