package com.appodealx.exchange.settings.models.buyer

import com.appodealx.exchange.common.models.auction.{AdProfileId, AdProfileTyped, BidderId}
import com.appodealx.exchange.common.models.dto.Native
import com.github.zafarkhaja.semver.Version

case class NativeAdProfile(id: Option[AdProfileId] = None,
                           bidderId: BidderId,
                           title: Option[String],
                           active: Boolean,
                           debug: Boolean,
                           adChannel: Option[Int] = None,
                           delayedNotification: Boolean,
                           interstitial: Boolean,
                           reward: Boolean,
                           ad: Native,
                           dmVerMax: Option[Version],
                           dmVerMin: Option[Version],
                           distributionChannel: Option[String],
                           template: Option[String],
                           allowCache: Option[Boolean],
                           allowCloseDelay: Option[Int]) extends AdProfileTyped[Native]
