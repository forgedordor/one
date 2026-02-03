package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcw {
    public static final /* synthetic */ int a = 0;
    private final ejyq b;

    static {
        TimeUnit.DAYS.toMicros(7L);
    }

    public drcw(final drcv drcvVar) {
        this.b = new ejyk().b(new ejyl(new ejvr() { // from class: drcr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = drcw.a;
                drcv drcvVar2 = drcvVar;
                Context context = drcvVar2.m;
                ExecutorService executorService = drcvVar2.f;
                drdj drdjVar = new drdj(context, executorService, drcvVar2.k);
                ejvr ejvrVar = drcvVar2.c;
                ejvr ejvrVar2 = drcvVar2.h;
                evrj evrjVar = drcvVar2.i;
                drbc drbcVar = new drbc(drdjVar);
                return new drdi((ejwi) obj, drcvVar2.a, drcvVar2.q, drcvVar2.b, ejvrVar, drcvVar2.g, ejvrVar2, evrjVar, drcvVar2.j, drbcVar, drcvVar2.d, drcvVar2.e, executorService, drcvVar2.l, ejsz.a, drcvVar2.n, drcvVar2.o, drcvVar2.m);
            }
        }));
    }

    public final ListenableFuture a(String str, String str2, Account account, String str3, ekhx ekhxVar, ewvn ewvnVar, int i, ejwi ejwiVar) {
        try {
            return ((drcx) this.b.a(ejwi.i(account))).a(str3, str2, str, ekhxVar, ewvnVar, i, ejwiVar);
        } catch (eotd | ExecutionException e) {
            ekqg ekqgVarListIterator = ekhxVar.listIterator();
            while (ekqgVarListIterator.hasNext()) {
                ((ewut) ekqgVarListIterator.next()).name();
            }
            return eork.h(new drcq("Failed to load GellerSyncScheduler", e));
        }
    }
}
