package defpackage;

import android.content.Context;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmep implements cmfe {
    private static final eksp a = eksp.c("BugleRcs");
    private final EventService b;
    private final ContactsService c;
    private final FileTransferService d;
    private final LocationSharingService e;
    private final ImsConnectionTrackerService f;
    private final RcsProfileService g;
    private final RcsMessagingService h;
    private final cmeq i;
    private final cqbm j;
    private final SingleRegistrationVendorImsService k;
    private final crma l;

    public cmep(Context context, efax efaxVar, cmeq cmeqVar, cqbm cqbmVar, fcsu fcsuVar, crma crmaVar, fcsu fcsuVar2) {
        eigp eigpVar = (eigp) efaxVar.a.b();
        eigpVar.getClass();
        cczn ccznVar = (cczn) efaxVar.b.b();
        ccznVar.getClass();
        efal efalVar = (efal) efaxVar.c.b();
        efalVar.getClass();
        context.getClass();
        cmeqVar.getClass();
        EventService eventService = new EventService(eigpVar, ccznVar, efalVar, context, cmeqVar);
        ContactsService contactsService = new ContactsService(context, cmeqVar, Optional.of((efal) fcsuVar.b()));
        FileTransferService fileTransferService = new FileTransferService(context, cmeqVar, Optional.of((efal) fcsuVar.b()));
        LocationSharingService locationSharingService = new LocationSharingService(context, cmeqVar);
        ImsConnectionTrackerService imsConnectionTrackerService = new ImsConnectionTrackerService(context, cmeqVar, Optional.of((efal) fcsuVar.b()));
        RcsProfileService rcsProfileService = new RcsProfileService(context, cmeqVar, (crse) fcsuVar2.b());
        RcsMessagingService rcsMessagingService = new RcsMessagingService(context, cmeqVar);
        new RcsEngineLifecycleService(context, cmeqVar);
        SingleRegistrationVendorImsService singleRegistrationVendorImsService = new SingleRegistrationVendorImsService(context, cmeqVar);
        new RcsEngineLifecycleServiceV2(context, cmeqVar);
        Optional.of((efal) fcsuVar.b());
        this.i = cmeqVar;
        this.j = cqbmVar;
        this.l = crmaVar;
        this.b = eventService;
        this.c = contactsService;
        this.d = fileTransferService;
        this.e = locationSharingService;
        this.f = imsConnectionTrackerService;
        this.g = rcsProfileService;
        this.h = rcsMessagingService;
        this.k = singleRegistrationVendorImsService;
    }

    private final void p(efaj efajVar) {
        if (!this.i.a) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.V(100, TimeUnit.MINUTES);
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "triggerRcsAvailabilityIfNotConnected", 336, "BugleRcsServiceFactory.java")).q("BugleRcsServiceFactory#triggerRcsAvailabilityIfNotConnected called when dual reg sip is disabled. Remove this call-site.");
            return;
        }
        if (efajVar.isConnected()) {
            return;
        }
        cqbm cqbmVar = this.j;
        if (((chza) cqbmVar.a()).d() == enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            ((chza) cqbmVar.a()).o(chyx.NO_HINT);
        }
    }

    @Override // defpackage.cmfe
    public final ContactsService a() {
        ContactsService contactsService = this.c;
        p(contactsService);
        return contactsService;
    }

    @Override // defpackage.cmfe
    public final EventService b() {
        EventService eventService = this.b;
        p(eventService);
        return eventService;
    }

    @Override // defpackage.cmfe
    public final FileTransferService c() {
        FileTransferService fileTransferService = this.d;
        p(fileTransferService);
        return fileTransferService;
    }

    @Override // defpackage.cmfe
    public final ImsConnectionTrackerService d() {
        ImsConnectionTrackerService imsConnectionTrackerService = this.f;
        p(imsConnectionTrackerService);
        return imsConnectionTrackerService;
    }

    @Override // defpackage.cmfe
    public final LocationSharingService e() {
        LocationSharingService locationSharingService = this.e;
        p(locationSharingService);
        return locationSharingService;
    }

    @Override // defpackage.cmfe
    public final efff f() {
        RcsMessagingService rcsMessagingService = this.h;
        p(rcsMessagingService);
        return rcsMessagingService;
    }

    @Override // defpackage.cmfe
    public final RcsMessagingService g() {
        RcsMessagingService rcsMessagingService = this.h;
        p(rcsMessagingService);
        return rcsMessagingService;
    }

    @Override // defpackage.cmfe
    public final RcsProfileService h() {
        RcsProfileService rcsProfileService = this.g;
        p(rcsProfileService);
        return rcsProfileService;
    }

    @Override // defpackage.cmfe
    public final BiFunction i() {
        return new BiFunction() { // from class: cmen
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsEngineLifecycleService((Context) obj, (efaq) obj2);
            }
        };
    }

    @Override // defpackage.cmfe
    public final BiFunction j() {
        return new BiFunction() { // from class: cmeo
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsEngineLifecycleServiceV2((Context) obj, (efaq) obj2);
            }
        };
    }

    @Override // defpackage.cmfe
    public final BiFunction k() {
        return new BiFunction() { // from class: cmel
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsMessagingService((Context) obj, (efaq) obj2);
            }
        };
    }

    @Override // defpackage.cmfe
    public final BiFunction l() {
        return new BiFunction() { // from class: cmem
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new SingleRegistrationVendorImsService((Context) obj, (efaq) obj2);
            }
        };
    }

    @Override // defpackage.cmfe
    public final void m() {
        int i;
        if (!this.i.a) {
            eksl ekslVar = (eksl) a.i();
            ekslVar.V(10, TimeUnit.MINUTES);
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "connect", 230, "BugleRcsServiceFactory.java")).q("BugleRcsServiceFactory#connect called when dual reg sip is disabled. This should not happen.");
            return;
        }
        if (!this.l.k()) {
            eksl ekslVar2 = (eksl) a.j();
            ekslVar2.Z(eksk.FULL);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "connect", 237, "BugleRcsServiceFactory.java")).q("Bugle is trying to connect to RCS without READ_PHONE_STATE permission.");
        }
        EventService eventService = this.b;
        if (eventService.isConnected()) {
            i = 0;
        } else {
            eventService.connect();
            i = 1;
        }
        ContactsService contactsService = this.c;
        if (!contactsService.isConnected()) {
            contactsService.connect();
            i++;
        }
        FileTransferService fileTransferService = this.d;
        if (!fileTransferService.isConnected()) {
            fileTransferService.connect();
            i++;
        }
        LocationSharingService locationSharingService = this.e;
        if (!locationSharingService.isConnected()) {
            locationSharingService.connect();
            i++;
        }
        ImsConnectionTrackerService imsConnectionTrackerService = this.f;
        if (!imsConnectionTrackerService.isConnected()) {
            imsConnectionTrackerService.connect();
            i++;
        }
        RcsProfileService rcsProfileService = this.g;
        if (!rcsProfileService.isConnected()) {
            rcsProfileService.connect();
            i++;
        }
        RcsMessagingService rcsMessagingService = this.h;
        if (!rcsMessagingService.isConnected()) {
            rcsMessagingService.connect();
            i++;
        }
        if (dfog.G()) {
            SingleRegistrationVendorImsService singleRegistrationVendorImsService = this.k;
            if (!singleRegistrationVendorImsService.isConnected()) {
                singleRegistrationVendorImsService.connect();
                i++;
            }
        }
        if (i > 0) {
            cqca.j("BugleRcs", "connecting to %d Rcs Services", Integer.valueOf(i));
        } else {
            cqca.l("BugleRcs", "RCS services already connected");
        }
    }

    @Override // defpackage.cmfe
    public final void n() {
        if (!this.i.a) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.V(10, TimeUnit.MINUTES);
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "disconnect", 284, "BugleRcsServiceFactory.java")).q("BugleRcsServiceFactory#disconnect called when dual reg sip is disabled. This should not happen.");
        }
        this.b.disconnect();
        this.c.disconnect();
        this.d.disconnect();
        this.e.disconnect();
        this.f.disconnect();
        this.g.disconnect();
        this.h.disconnect();
        if (dfog.G()) {
            this.k.disconnect();
        }
        cqca.n("BugleRcs", "disconnecting from all Rcs Services");
    }

    @Override // defpackage.cmfe
    public final void o(efaq efaqVar) {
        cmeq cmeqVar = this.i;
        if (cmeqVar.a) {
            cmeqVar.a(efaqVar);
            return;
        }
        eksl ekslVar = (eksl) a.j();
        ekslVar.V(10, TimeUnit.MINUTES);
        ekslVar.Z(eksk.FULL);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "registerJibeServiceListener", 148, "BugleRcsServiceFactory.java")).q("BugleRcsServiceFactory#registerJibeServiceListener called when dual reg sip is disabled. This call should be disabled when CslibSettings.isJibeSipEnabled() is false.");
    }
}
