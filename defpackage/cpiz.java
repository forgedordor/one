package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpiz {
    public static volatile boolean b;
    static boolean c;
    public final Context d;
    public final eosc e;
    public final eosc f;
    private final fcsu h;
    private final fcsu i;
    public static final eksp a = eksp.c("BugleBlock");
    private static final Lock g = new ReentrantLock();

    public cpiz(Context context, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.d = context;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.e = eoscVar;
        this.f = eoscVar2;
    }

    public final void a(final Context context, final Class cls) {
        auvh.h(eijx.g(new Callable() { // from class: cpiu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean zC;
                if (cpiz.b) {
                    ((eksl) ((eksl) cpiz.a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveSystemBlockList", 77, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#haveSystemBlockList: debugUseLocalBlocking is true");
                    zC = false;
                } else {
                    zC = this.a.c();
                }
                return Boolean.valueOf(zC);
            }
        }, this.f).h(new ejvr() { // from class: cpiv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Context context2 = context;
                if (zBooleanValue) {
                    cpiz cpizVar = this.a;
                    if (cpizVar.d()) {
                        TelecomManager telecomManager = (TelecomManager) context2.getSystemService("telecom");
                        telecomManager.getClass();
                        eiid.o(context2, telecomManager.createManageBlockedNumbersIntent());
                        return null;
                    }
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("launchBlockedContacts");
                    bsboVarE.h(new Function() { // from class: cpiq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar = (bsbx) obj2;
                            eksp ekspVar = cpiz.a;
                            bsbxVar.c();
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (bsboVarE.b().W()) {
                        cpizVar.b(true);
                        TelecomManager telecomManager2 = (TelecomManager) context2.getSystemService("telecom");
                        try {
                            telecomManager2.getClass();
                            eiid.o(context2, telecomManager2.createManageBlockedNumbersIntent());
                            return null;
                        } catch (Throwable unused) {
                            ((eksl) ((eksl) cpiz.a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "launchBlockedContacts", 130, "BlockedParticipantsUtil.java")).q("launchBlockedContacts: haveSystemBlockList but failed to open");
                        }
                    }
                }
                eiid.o(context2, new Intent(context2, (Class<?>) cls));
                return null;
            }
        }, this.e));
    }

    public final void b(boolean z) {
        Lock lock = g;
        lock.lock();
        try {
            if (!b) {
                ((crqv) this.h.b()).h("app_already_migrated_blocked_contacts", z);
                c = z;
            } else if (!z) {
                z = false;
                ((crqv) this.h.b()).h("app_already_migrated_blocked_contacts", z);
                c = z;
            }
            lock.unlock();
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    public final boolean c() {
        boolean zD = ((crnp) this.i.b()).d();
        boolean zI = craf.i(this.d);
        boolean z = !zI;
        boolean z2 = false;
        if (zD && !zI) {
            z2 = true;
        }
        if (!z2) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "canAttemptToQuerySystemBlockList", 207, "BlockedParticipantsUtil.java")).H("BlockedParticipantsUtil#isDefaultAppAndPrimaryUser isDefaultSmsApp: %b | isPrimaryUser: %b", zD, z);
        }
        return z2;
    }

    public final boolean d() {
        Lock lock = g;
        lock.lock();
        try {
            if (c) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 161, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: blocked contacts already migrated");
                lock.unlock();
                return true;
            }
            c = ((crqv) this.h.b()).q("app_already_migrated_blocked_contacts", false);
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 172, "BlockedParticipantsUtil.java")).t("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: check haveMigratedContacts from prefs: %b", Boolean.valueOf(c));
            boolean z = c;
            lock.unlock();
            return z;
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    final boolean e() {
        if (c()) {
            return d();
        }
        return false;
    }
}
