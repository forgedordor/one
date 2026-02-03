package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexi implements dhab {
    final /* synthetic */ dexn a;

    public dexi(dexn dexnVar) {
        this.a = dexnVar;
    }

    @Override // defpackage.dhab
    public final void a(dgzn dgznVar, String str, boolean z) {
        Event chatSessionEvent;
        final dexn dexnVar = this.a;
        if (dfcq.a(dexnVar.h, str)) {
            dhja.c("Discarding is-composing indicator for blocked user: %s", dhiz.USER_ID.c(str));
            return;
        }
        dhja.c("Getting is composing indicator for: %s state: %b", dhiz.USER_ID.c(str), Boolean.valueOf(z));
        long j = true != z ? 0L : 1L;
        if (dgznVar == null) {
            chatSessionEvent = new ChatSessionEvent(50050, 0L, 1L, str);
        } else {
            long jM = dexnVar.m(dgznVar);
            if (dgznVar.E) {
                Optional optionalA = dexnVar.j.a(jM);
                dgiu dgiuVar = dexnVar.p;
                final String strM = dhjv.m(str, (String) dgiuVar.a().map(new Function() { // from class: dewx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dhip dhipVar = dexn.d;
                        return ((dgiq) obj).m().n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""), dexnVar.n, ((Boolean) dgiuVar.a().map(new Function() { // from class: dewy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dhip dhipVar = dexn.d;
                        return Boolean.valueOf("tel".equals(((dgiq) obj).m().o()));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(true)).booleanValue());
                Optional optionalFlatMap = optionalA.flatMap(new Function() { // from class: dewv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dhgp) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: deww
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dezn) obj).d.a(strM, dexnVar.n);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (optionalFlatMap.isEmpty()) {
                    dhja.c("user is not found with sessionId %d", Long.valueOf(jM));
                }
                if (optionalFlatMap.isPresent()) {
                    UserInfo userInfoO = dexnVar.o((dfaj) optionalFlatMap.get());
                    dhbu dhbuVar = new dhbu(50050, jM, j);
                    dhbuVar.b(userInfoO);
                    chatSessionEvent = new GroupChatSessionEvent(dhbuVar);
                } else {
                    chatSessionEvent = null;
                }
            } else {
                chatSessionEvent = new ChatSessionEvent(50050, jM, j, str);
            }
        }
        if (chatSessionEvent != null) {
            dexnVar.g.c(chatSessionEvent, dhjl.IMS_CHAT_SESSION_PROVIDER);
        }
    }
}
