package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekz implements fekj {
    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws fekk, IllegalAccessException, NoSuchFieldException, InstantiationException, IllegalArgumentException {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i));
                    return;
                }
            }
            declaredField.set(objNewInstance, objValueOf.toString());
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", (i != 0 ? Integer.valueOf(i) : "").toString());
            if (!felc.a(context, intent)) {
                throw new fekk("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
            }
            context.sendBroadcast(intent);
        }
    }
}
