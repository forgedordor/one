package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrz {
    public static fbni a(final fcsu fcsuVar) {
        return new esry(new fcsu() { // from class: esrx
            @Override // defpackage.fcsu
            public final Object b() {
                return ekgb.r((ekgb) fcsuVar.b());
            }
        }, evuh.class, evuh.class);
    }

    public static void b(fbrk fbrkVar, Class cls, boolean z) {
        Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((fcrh) (z ? fbrkVar.d : fbrkVar.e)).a.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        String str = true != z ? GroupManagementResponse.XML_TAG : GroupManagementRequest.XML_TAG;
        String str2 = fbrkVar.b;
        throw Status.o.withDescription("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()).asException();
    }
}
