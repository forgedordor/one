package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.IFlpDebugListener;
import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationAvailabilityRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.IBooleanStatusCallback;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import com.google.android.gms.location.internal.IGeofencerCallbacks;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import com.google.android.gms.location.internal.ISettingsCallbacks;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleLocationManagerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleLocationManagerService {
        static final int TRANSACTION_addGeofence = 1;
        static final int TRANSACTION_addGeofenceByGeofencingRequest = 57;
        static final int TRANSACTION_addGeofences = 97;
        static final int TRANSACTION_checkLocationSettings = 63;
        static final int TRANSACTION_flushActivityRecognitionResults = 71;
        static final int TRANSACTION_flushLocations = 67;
        static final int TRANSACTION_getActivityRecognitionMode = 78;
        static final int TRANSACTION_getCurrentLocation = 87;
        static final int TRANSACTION_getCurrentLocationWithCallback = 92;
        static final int TRANSACTION_getLastActivity = 64;
        static final int TRANSACTION_getLastActivityWithFeature = 81;
        static final int TRANSACTION_getLastAvailability = 91;
        static final int TRANSACTION_getLastAvailabilityWithPackage = 34;
        static final int TRANSACTION_getLastLocation = 7;
        static final int TRANSACTION_getLastLocationWithAttribution = 80;
        static final int TRANSACTION_getLastLocationWithCallback = 90;
        static final int TRANSACTION_getLastLocationWithPackage = 21;
        static final int TRANSACTION_getLastLocationWithRequest = 82;
        static final int TRANSACTION_injectLocation = 26;
        static final int TRANSACTION_injectLocationWithCallback = 86;
        static final int TRANSACTION_isGoogleLocationAccuracyEnabled = 95;
        static final int TRANSACTION_isLocationEnabled = 99;
        static final int TRANSACTION_registerDebugListener = 93;
        static final int TRANSACTION_registerLocationClient = 88;
        static final int TRANSACTION_removeActivityTransitionUpdates = 73;
        static final int TRANSACTION_removeActivityUpdates = 6;
        static final int TRANSACTION_removeFloorChangeUpdates = 66;
        static final int TRANSACTION_removeGeofenceByRemoveGeofencingRequest = 74;
        static final int TRANSACTION_removeGeofences = 98;
        static final int TRANSACTION_removeGeofencesByPendingIntent = 2;
        static final int TRANSACTION_removeGeofencesByRequestIds = 3;
        static final int TRANSACTION_removeLocationUpdates = 10;
        static final int TRANSACTION_removeLocationUpdatesWithPendingIntent = 11;
        static final int TRANSACTION_removeSleepSegmentUpdates = 69;
        static final int TRANSACTION_requestActivityTransitionUpdates = 72;
        static final int TRANSACTION_requestActivityUpdates = 5;
        static final int TRANSACTION_requestActivityUpdates2 = 70;
        static final int TRANSACTION_requestFloorChangeUpdates = 65;
        static final int TRANSACTION_requestLocationUpdates = 8;
        static final int TRANSACTION_requestLocationUpdatesInternal = 52;
        static final int TRANSACTION_requestLocationUpdatesInternalWithPendingIntent = 53;
        static final int TRANSACTION_requestLocationUpdatesWithPackage = 20;
        static final int TRANSACTION_requestLocationUpdatesWithPendingIntent = 9;
        static final int TRANSACTION_requestSleepSegmentUpdates = 68;
        static final int TRANSACTION_requestSleepSegments = 79;
        static final int TRANSACTION_setActivityRecognitionMode = 77;
        static final int TRANSACTION_setGoogleLocationAccuracyEnabled = 96;
        static final int TRANSACTION_setMockLocation = 13;
        static final int TRANSACTION_setMockLocationWithCallback = 85;
        static final int TRANSACTION_setMockMode = 12;
        static final int TRANSACTION_setMockModeWithCallback = 84;
        static final int TRANSACTION_unregisterDebugListener = 94;
        static final int TRANSACTION_unregisterLocationClient = 89;
        static final int TRANSACTION_updateDeviceOrientationRequest = 75;
        static final int TRANSACTION_updateLocationRequest = 59;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleLocationManagerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGeofencerCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, geofencingRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofenceByGeofencingRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, geofencingRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofences, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationSettingsRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSettingsCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(63, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushActivityRecognitionResults(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushActivityRecognitionResults, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFusedLocationProviderCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushLocations, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public int getActivityRecognitionMode() {
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getActivityRecognitionMode, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, currentLocationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocation, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, currentLocationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationReceiver);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocationWithCallback, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivity(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(64, parcelObtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) sgh.a(parcelTransactAndReadException, ActivityRecognitionResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivityWithFeature(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getLastActivityWithFeature, parcelObtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) sgh.a(parcelTransactAndReadException, ActivityRecognitionResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationAvailabilityRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastAvailability, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public LocationAvailability getLastAvailabilityWithPackage(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(34, parcelObtainAndWriteInterfaceToken);
                LocationAvailability locationAvailability = (LocationAvailability) sgh.a(parcelTransactAndReadException, LocationAvailability.CREATOR);
                parcelTransactAndReadException.recycle();
                return locationAvailability;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocation() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                Location location = (Location) sgh.a(parcelTransactAndReadException, Location.CREATOR);
                parcelTransactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithAttribution(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(80, parcelObtainAndWriteInterfaceToken);
                Location location = (Location) sgh.a(parcelTransactAndReadException, Location.CREATOR);
                parcelTransactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, lastLocationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithCallback, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithPackage(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
                Location location = (Location) sgh.a(parcelTransactAndReadException, Location.CREATOR);
                parcelTransactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, lastLocationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocation(Location location, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_injectLocationWithCallback, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isGoogleLocationAccuracyEnabled, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isLocationEnabled, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFlpDebugListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerDebugListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationReceiver);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerLocationClient, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeActivityTransitionUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityUpdates(PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeFloorChangeUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, removeGeofencingRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofenceByRemoveGeofencingRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, removeGeofencingRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofences, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGeofencerCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGeofencerCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdates(ILocationListener iLocationListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeSleepSegmentUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, activityTransitionRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityTransitionUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, activityRecognitionRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityUpdates2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestFloorChangeUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequestInternal);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternal, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequestInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternalWithPendingIntent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationListener);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegmentUpdates, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, sleepSegmentRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegments, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public boolean setActivityRecognitionMode(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_setActivityRecognitionMode, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setGoogleLocationAccuracyRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(96, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocation(Location location) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockLocationWithCallback, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockMode(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockModeWithCallback, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFlpDebugListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterDebugListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationReceiver);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterLocationClient, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, deviceOrientationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateDeviceOrientationRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, locationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateLocationRequest, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        }

        public static IGoogleLocationManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return iInterfaceQueryLocalInterface instanceof IGoogleLocationManagerService ? (IGoogleLocationManagerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks iGeofencerCallbacksAsInterface = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                addGeofence(arrayListCreateTypedArrayList, pendingIntent, iGeofencerCallbacksAsInterface, string);
                parcel2.writeNoException();
            } else if (i == 2) {
                PendingIntent pendingIntent2 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks iGeofencerCallbacksAsInterface2 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                removeGeofencesByPendingIntent(pendingIntent2, iGeofencerCallbacksAsInterface2, string2);
                parcel2.writeNoException();
            } else if (i == 3) {
                String[] strArrCreateStringArray = parcel.createStringArray();
                IGeofencerCallbacks iGeofencerCallbacksAsInterface3 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                enforceNoDataAvail(parcel);
                removeGeofencesByRequestIds(strArrCreateStringArray, iGeofencerCallbacksAsInterface3, string3);
                parcel2.writeNoException();
            } else if (i == 20) {
                LocationRequest locationRequest = (LocationRequest) sgh.a(parcel, LocationRequest.CREATOR);
                ILocationListener iLocationListenerAsInterface = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                String string4 = parcel.readString();
                enforceNoDataAvail(parcel);
                requestLocationUpdatesWithPackage(locationRequest, iLocationListenerAsInterface, string4);
                parcel2.writeNoException();
            } else if (i == 21) {
                String string5 = parcel.readString();
                enforceNoDataAvail(parcel);
                Location lastLocationWithPackage = getLastLocationWithPackage(string5);
                parcel2.writeNoException();
                sgh.e(parcel2, lastLocationWithPackage);
            } else if (i == 26) {
                Location location = (Location) sgh.a(parcel, Location.CREATOR);
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                injectLocation(location, i3);
                parcel2.writeNoException();
            } else if (i == 34) {
                String string6 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationAvailability lastAvailabilityWithPackage = getLastAvailabilityWithPackage(string6);
                parcel2.writeNoException();
                sgh.e(parcel2, lastAvailabilityWithPackage);
            } else if (i == TRANSACTION_addGeofenceByGeofencingRequest) {
                GeofencingRequest geofencingRequest = (GeofencingRequest) sgh.a(parcel, GeofencingRequest.CREATOR);
                PendingIntent pendingIntent3 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks iGeofencerCallbacksAsInterface4 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                addGeofenceByGeofencingRequest(geofencingRequest, pendingIntent3, iGeofencerCallbacksAsInterface4);
                parcel2.writeNoException();
            } else if (i == TRANSACTION_updateLocationRequest) {
                LocationRequestUpdateData locationRequestUpdateData = (LocationRequestUpdateData) sgh.a(parcel, LocationRequestUpdateData.CREATOR);
                enforceNoDataAvail(parcel);
                updateLocationRequest(locationRequestUpdateData);
                parcel2.writeNoException();
            } else if (i == TRANSACTION_requestLocationUpdatesInternal) {
                LocationRequestInternal locationRequestInternal = (LocationRequestInternal) sgh.a(parcel, LocationRequestInternal.CREATOR);
                ILocationListener iLocationListenerAsInterface2 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestLocationUpdatesInternal(locationRequestInternal, iLocationListenerAsInterface2);
                parcel2.writeNoException();
            } else if (i != TRANSACTION_requestLocationUpdatesInternalWithPendingIntent) {
                switch (i) {
                    case 5:
                        long j = parcel.readLong();
                        boolean zG = sgh.g(parcel);
                        PendingIntent pendingIntent4 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        requestActivityUpdates(j, zG, pendingIntent4);
                        parcel2.writeNoException();
                        break;
                    case 6:
                        PendingIntent pendingIntent5 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        removeActivityUpdates(pendingIntent5);
                        parcel2.writeNoException();
                        break;
                    case 7:
                        Location lastLocation = getLastLocation();
                        parcel2.writeNoException();
                        sgh.e(parcel2, lastLocation);
                        break;
                    case 8:
                        LocationRequest locationRequest2 = (LocationRequest) sgh.a(parcel, LocationRequest.CREATOR);
                        ILocationListener iLocationListenerAsInterface3 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        requestLocationUpdates(locationRequest2, iLocationListenerAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        LocationRequest locationRequest3 = (LocationRequest) sgh.a(parcel, LocationRequest.CREATOR);
                        PendingIntent pendingIntent6 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        requestLocationUpdatesWithPendingIntent(locationRequest3, pendingIntent6);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        ILocationListener iLocationListenerAsInterface4 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        removeLocationUpdates(iLocationListenerAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        PendingIntent pendingIntent7 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        removeLocationUpdatesWithPendingIntent(pendingIntent7);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        boolean zG2 = sgh.g(parcel);
                        enforceNoDataAvail(parcel);
                        setMockMode(zG2);
                        parcel2.writeNoException();
                        break;
                    case 13:
                        Location location2 = (Location) sgh.a(parcel, Location.CREATOR);
                        enforceNoDataAvail(parcel);
                        setMockLocation(location2);
                        parcel2.writeNoException();
                        break;
                    default:
                        switch (i) {
                            case 63:
                                LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) sgh.a(parcel, LocationSettingsRequest.CREATOR);
                                ISettingsCallbacks iSettingsCallbacksAsInterface = ISettingsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                String string7 = parcel.readString();
                                enforceNoDataAvail(parcel);
                                checkLocationSettings(locationSettingsRequest, iSettingsCallbacksAsInterface, string7);
                                parcel2.writeNoException();
                                break;
                            case 64:
                                String string8 = parcel.readString();
                                enforceNoDataAvail(parcel);
                                ActivityRecognitionResult lastActivity = getLastActivity(string8);
                                parcel2.writeNoException();
                                sgh.e(parcel2, lastActivity);
                                break;
                            case TRANSACTION_requestFloorChangeUpdates /* 65 */:
                                PendingIntent pendingIntent8 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestFloorChangeUpdates(pendingIntent8, iStatusCallbackAsInterface);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeFloorChangeUpdates /* 66 */:
                                PendingIntent pendingIntent9 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeFloorChangeUpdates(pendingIntent9, iStatusCallbackAsInterface2);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_flushLocations /* 67 */:
                                IFusedLocationProviderCallback iFusedLocationProviderCallbackAsInterface = IFusedLocationProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                flushLocations(iFusedLocationProviderCallbackAsInterface);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestSleepSegmentUpdates /* 68 */:
                                PendingIntent pendingIntent10 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestSleepSegmentUpdates(pendingIntent10, iStatusCallbackAsInterface3);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeSleepSegmentUpdates /* 69 */:
                                PendingIntent pendingIntent11 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeSleepSegmentUpdates(pendingIntent11, iStatusCallbackAsInterface4);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestActivityUpdates2 /* 70 */:
                                ActivityRecognitionRequest activityRecognitionRequest = (ActivityRecognitionRequest) sgh.a(parcel, ActivityRecognitionRequest.CREATOR);
                                PendingIntent pendingIntent12 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestActivityUpdates2(activityRecognitionRequest, pendingIntent12, iStatusCallbackAsInterface5);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_flushActivityRecognitionResults /* 71 */:
                                IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                flushActivityRecognitionResults(iStatusCallbackAsInterface6);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestActivityTransitionUpdates /* 72 */:
                                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) sgh.a(parcel, ActivityTransitionRequest.CREATOR);
                                PendingIntent pendingIntent13 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestActivityTransitionUpdates(activityTransitionRequest, pendingIntent13, iStatusCallbackAsInterface7);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeActivityTransitionUpdates /* 73 */:
                                PendingIntent pendingIntent14 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeActivityTransitionUpdates(pendingIntent14, iStatusCallbackAsInterface8);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeGeofenceByRemoveGeofencingRequest /* 74 */:
                                RemoveGeofencingRequest removeGeofencingRequest = (RemoveGeofencingRequest) sgh.a(parcel, RemoveGeofencingRequest.CREATOR);
                                IGeofencerCallbacks iGeofencerCallbacksAsInterface5 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeGeofenceByRemoveGeofencingRequest(removeGeofencingRequest, iGeofencerCallbacksAsInterface5);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_updateDeviceOrientationRequest /* 75 */:
                                DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData = (DeviceOrientationRequestUpdateData) sgh.a(parcel, DeviceOrientationRequestUpdateData.CREATOR);
                                enforceNoDataAvail(parcel);
                                updateDeviceOrientationRequest(deviceOrientationRequestUpdateData);
                                parcel2.writeNoException();
                                break;
                            default:
                                switch (i) {
                                    case TRANSACTION_setActivityRecognitionMode /* 77 */:
                                        int i4 = parcel.readInt();
                                        enforceNoDataAvail(parcel);
                                        boolean activityRecognitionMode = setActivityRecognitionMode(i4);
                                        parcel2.writeNoException();
                                        int i5 = sgh.a;
                                        parcel2.writeInt(activityRecognitionMode ? 1 : 0);
                                        break;
                                    case TRANSACTION_getActivityRecognitionMode /* 78 */:
                                        int activityRecognitionMode2 = getActivityRecognitionMode();
                                        parcel2.writeNoException();
                                        parcel2.writeInt(activityRecognitionMode2);
                                        break;
                                    case TRANSACTION_requestSleepSegments /* 79 */:
                                        PendingIntent pendingIntent15 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) sgh.a(parcel, SleepSegmentRequest.CREATOR);
                                        IStatusCallback iStatusCallbackAsInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                        enforceNoDataAvail(parcel);
                                        requestSleepSegments(pendingIntent15, sleepSegmentRequest, iStatusCallbackAsInterface9);
                                        parcel2.writeNoException();
                                        break;
                                    case 80:
                                        String string9 = parcel.readString();
                                        enforceNoDataAvail(parcel);
                                        Location lastLocationWithAttribution = getLastLocationWithAttribution(string9);
                                        parcel2.writeNoException();
                                        sgh.e(parcel2, lastLocationWithAttribution);
                                        break;
                                    case TRANSACTION_getLastActivityWithFeature /* 81 */:
                                        String string10 = parcel.readString();
                                        String string11 = parcel.readString();
                                        enforceNoDataAvail(parcel);
                                        ActivityRecognitionResult lastActivityWithFeature = getLastActivityWithFeature(string10, string11);
                                        parcel2.writeNoException();
                                        sgh.e(parcel2, lastActivityWithFeature);
                                        break;
                                    case TRANSACTION_getLastLocationWithRequest /* 82 */:
                                        LastLocationRequest lastLocationRequest = (LastLocationRequest) sgh.a(parcel, LastLocationRequest.CREATOR);
                                        ILocationStatusCallback iLocationStatusCallbackAsInterface = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                        enforceNoDataAvail(parcel);
                                        getLastLocationWithRequest(lastLocationRequest, iLocationStatusCallbackAsInterface);
                                        parcel2.writeNoException();
                                        break;
                                    default:
                                        switch (i) {
                                            case TRANSACTION_setMockModeWithCallback /* 84 */:
                                                boolean zG3 = sgh.g(parcel);
                                                IStatusCallback iStatusCallbackAsInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setMockModeWithCallback(zG3, iStatusCallbackAsInterface10);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_setMockLocationWithCallback /* 85 */:
                                                Location location3 = (Location) sgh.a(parcel, Location.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setMockLocationWithCallback(location3, iStatusCallbackAsInterface11);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_injectLocationWithCallback /* 86 */:
                                                Location location4 = (Location) sgh.a(parcel, Location.CREATOR);
                                                int i6 = parcel.readInt();
                                                IStatusCallback iStatusCallbackAsInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                injectLocationWithCallback(location4, i6, iStatusCallbackAsInterface12);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getCurrentLocation /* 87 */:
                                                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) sgh.a(parcel, CurrentLocationRequest.CREATOR);
                                                ILocationStatusCallback iLocationStatusCallbackAsInterface2 = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                ICancelToken currentLocation = getCurrentLocation(currentLocationRequest, iLocationStatusCallbackAsInterface2);
                                                parcel2.writeNoException();
                                                sgh.f(parcel2, currentLocation);
                                                break;
                                            case TRANSACTION_registerLocationClient /* 88 */:
                                                LocationReceiver locationReceiver = (LocationReceiver) sgh.a(parcel, LocationReceiver.CREATOR);
                                                LocationRequest locationRequest4 = (LocationRequest) sgh.a(parcel, LocationRequest.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                registerLocationClient(locationReceiver, locationRequest4, iStatusCallbackAsInterface13);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_unregisterLocationClient /* 89 */:
                                                LocationReceiver locationReceiver2 = (LocationReceiver) sgh.a(parcel, LocationReceiver.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                unregisterLocationClient(locationReceiver2, iStatusCallbackAsInterface14);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getLastLocationWithCallback /* 90 */:
                                                LastLocationRequest lastLocationRequest2 = (LastLocationRequest) sgh.a(parcel, LastLocationRequest.CREATOR);
                                                LocationReceiver locationReceiver3 = (LocationReceiver) sgh.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                getLastLocationWithCallback(lastLocationRequest2, locationReceiver3);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getLastAvailability /* 91 */:
                                                LocationAvailabilityRequest locationAvailabilityRequest = (LocationAvailabilityRequest) sgh.a(parcel, LocationAvailabilityRequest.CREATOR);
                                                LocationReceiver locationReceiver4 = (LocationReceiver) sgh.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                getLastAvailability(locationAvailabilityRequest, locationReceiver4);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getCurrentLocationWithCallback /* 92 */:
                                                CurrentLocationRequest currentLocationRequest2 = (CurrentLocationRequest) sgh.a(parcel, CurrentLocationRequest.CREATOR);
                                                LocationReceiver locationReceiver5 = (LocationReceiver) sgh.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                ICancelToken currentLocationWithCallback = getCurrentLocationWithCallback(currentLocationRequest2, locationReceiver5);
                                                parcel2.writeNoException();
                                                sgh.f(parcel2, currentLocationWithCallback);
                                                break;
                                            case TRANSACTION_registerDebugListener /* 93 */:
                                                IFlpDebugListener iFlpDebugListenerAsInterface = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                IStatusCallback iStatusCallbackAsInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                registerDebugListener(iFlpDebugListenerAsInterface, iStatusCallbackAsInterface15);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_unregisterDebugListener /* 94 */:
                                                IFlpDebugListener iFlpDebugListenerAsInterface2 = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                IStatusCallback iStatusCallbackAsInterface16 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                unregisterDebugListener(iFlpDebugListenerAsInterface2, iStatusCallbackAsInterface16);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_isGoogleLocationAccuracyEnabled /* 95 */:
                                                IBooleanStatusCallback iBooleanStatusCallbackAsInterface = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                isGoogleLocationAccuracyEnabled(iBooleanStatusCallbackAsInterface);
                                                parcel2.writeNoException();
                                                break;
                                            case 96:
                                                SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest = (SetGoogleLocationAccuracyRequest) sgh.a(parcel, SetGoogleLocationAccuracyRequest.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface17 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setGoogleLocationAccuracyEnabled(setGoogleLocationAccuracyRequest, iStatusCallbackAsInterface17);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_addGeofences /* 97 */:
                                                GeofencingRequest geofencingRequest2 = (GeofencingRequest) sgh.a(parcel, GeofencingRequest.CREATOR);
                                                PendingIntent pendingIntent16 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                addGeofences(geofencingRequest2, pendingIntent16, iStatusCallbackAsInterface18);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_removeGeofences /* 98 */:
                                                RemoveGeofencingRequest removeGeofencingRequest2 = (RemoveGeofencingRequest) sgh.a(parcel, RemoveGeofencingRequest.CREATOR);
                                                IStatusCallback iStatusCallbackAsInterface19 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                removeGeofences(removeGeofencingRequest2, iStatusCallbackAsInterface19);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_isLocationEnabled /* 99 */:
                                                IBooleanStatusCallback iBooleanStatusCallbackAsInterface2 = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                isLocationEnabled(iBooleanStatusCallbackAsInterface2);
                                                parcel2.writeNoException();
                                                break;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
            } else {
                LocationRequestInternal locationRequestInternal2 = (LocationRequestInternal) sgh.a(parcel, LocationRequestInternal.CREATOR);
                PendingIntent pendingIntent17 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                requestLocationUpdatesInternalWithPendingIntent(locationRequestInternal2, pendingIntent17);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    @Deprecated
    void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks);

    void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str);

    void flushActivityRecognitionResults(IStatusCallback iStatusCallback);

    void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback);

    @Deprecated
    int getActivityRecognitionMode();

    @Deprecated
    ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    ActivityRecognitionResult getLastActivity(String str);

    ActivityRecognitionResult getLastActivityWithFeature(String str, String str2);

    void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver);

    @Deprecated
    LocationAvailability getLastAvailabilityWithPackage(String str);

    @Deprecated
    Location getLastLocation();

    @Deprecated
    Location getLastLocationWithAttribution(String str);

    void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    Location getLastLocationWithPackage(String str);

    @Deprecated
    void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    @Deprecated
    void injectLocation(Location location, int i);

    void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback);

    void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback);

    void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void removeActivityUpdates(PendingIntent pendingIntent);

    @Deprecated
    void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks);

    void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeLocationUpdates(ILocationListener iLocationListener);

    @Deprecated
    void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent);

    void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent);

    void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    @Deprecated
    void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str);

    @Deprecated
    void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent);

    void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback);

    @Deprecated
    boolean setActivityRecognitionMode(int i);

    void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockLocation(Location location);

    void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockMode(boolean z);

    void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback);

    void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback);

    void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    @Deprecated
    void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData);
}
